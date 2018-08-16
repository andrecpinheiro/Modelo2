package businnes;
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



/**
 * This class provides encode/decode for RFC 2045 Base64 as defined by RFC 2045,
 * N. Freed and N. Borenstein. RFC 2045: Multipurpose Internet Mail Extensions
 * (MIME) Part One: Format of Internet Message Bodies. Reference 1996 Available
 * at: http://www.ietf.org/rfc/rfc2045.txt This class is used by XML Schema
 * binary format validation
 * 
 * This implementation does not encode/decode streaming data. You need the data
 * that you will encode/decode already on a byte arrray.
 * 
 * @author Jeffrey Rodriguez
 * @author Sandy Gao
 * @version $Id$
 */
public final class Base64 {

    private static final int BASELENGTH = 128;
    private static final int LOOKUPLENGTH = 64;
    private static final int TWENTYFOURBITGROUP = 24;
    private static final int EIGHTBIT = 8;
    private static final int SIXTEENBIT = 16;
    private static final int FOURBYTE = 4;
    private static final int SIGN = -128;
    private static final char PAD = '=';
    private static final byte[] BASE_64_ALPHABET = new byte[BASELENGTH];
    private static final char[] LOOKUP_BASE_64_ALPHABET = new char[LOOKUPLENGTH];

    static {

        for (int i = 0; i < BASELENGTH; ++i) {
            BASE_64_ALPHABET[i] = -1;
        }
        for (int i = 'Z'; i >= 'A'; i--) {
            BASE_64_ALPHABET[i] = (byte) (i - 'A');
        }
        for (int i = 'z'; i >= 'a'; i--) {
            BASE_64_ALPHABET[i] = (byte) (i - 'a' + 26);
        }

        for (int i = '9'; i >= '0'; i--) {
            BASE_64_ALPHABET[i] = (byte) (i - '0' + 52);
        }

        BASE_64_ALPHABET['+'] = 62;
        BASE_64_ALPHABET['/'] = 63;

        for (int i = 0; i <= 25; i++) {
            LOOKUP_BASE_64_ALPHABET[i] = (char) ('A' + i);
        }

        for (int i = 26, j = 0; i <= 51; i++, j++) {
            LOOKUP_BASE_64_ALPHABET[i] = (char) ('a' + j);
        }

        for (int i = 52, j = 0; i <= 61; i++, j++) {
            LOOKUP_BASE_64_ALPHABET[i] = (char) ('0' + j);
        }
        LOOKUP_BASE_64_ALPHABET[62] = '+';
        LOOKUP_BASE_64_ALPHABET[63] = '/';

    }

    protected static boolean isWhiteSpace(char octect) {
        return (octect == 0x20 || octect == 0xd || octect == 0xa || octect == 0x9);
    }

    protected static boolean isPad(char octect) {
        return (octect == PAD);
    }

    protected static boolean isData(char octect) {
        return (octect < BASELENGTH && BASE_64_ALPHABET[octect] != -1);
    }

    protected static boolean isBase64(char octect) {
        return (isWhiteSpace(octect) || isPad(octect) || isData(octect));
    }

    /**
     * Encodes hex octects into Base64
     * 
     * @param binaryData
     *            Array containing binaryData
     * @return Encoded Base64 array
     */
    public static String encode(byte[] binaryData) {

        if (binaryData == null) {
            return null;
        }

        int lengthDataBits = binaryData.length * EIGHTBIT;
        if (lengthDataBits == 0) {
            return "";
        }

        int fewerThan24bits = lengthDataBits % TWENTYFOURBITGROUP;
        int numberTriplets = lengthDataBits / TWENTYFOURBITGROUP;
        int numberQuartet = fewerThan24bits != 0 ? numberTriplets + 1
                : numberTriplets;
        char encodedData[] = null;

        encodedData = new char[numberQuartet * 4];

        byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;

        int encodedIndex = 0;
        int dataIndex = 0;

        for (int i = 0; i < numberTriplets; i++) {
            b1 = binaryData[dataIndex++];
            b2 = binaryData[dataIndex++];
            b3 = binaryData[dataIndex++];

            l = (byte) (b2 & 0x0f);
            k = (byte) (b1 & 0x03);

            byte val1 = ((b1 & SIGN) == 0) ? (byte) (b1 >> 2)
                    : (byte) ((b1) >> 2 ^ 0xc0);

            byte val2 = ((b2 & SIGN) == 0) ? (byte) (b2 >> 4)
                    : (byte) ((b2) >> 4 ^ 0xf0);
            byte val3 = ((b3 & SIGN) == 0) ? (byte) (b3 >> 6)
                    : (byte) ((b3) >> 6 ^ 0xfc);

            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[val1];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[val2
                    | (k << 4)];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[(l << 2)
                    | val3];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[b3 & 0x3f];
        }

        // form integral number of 6-bit groups
        if (fewerThan24bits == EIGHTBIT) {
            b1 = binaryData[dataIndex];
            k = (byte) (b1 & 0x03);

            byte val1 = ((b1 & SIGN) == 0) ? (byte) (b1 >> 2)
                    : (byte) ((b1) >> 2 ^ 0xc0);
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[val1];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[k << 4];
            encodedData[encodedIndex++] = PAD;
            encodedData[encodedIndex++] = PAD;
        } else if (fewerThan24bits == SIXTEENBIT) {
            b1 = binaryData[dataIndex];
            b2 = binaryData[dataIndex + 1];
            l = (byte) (b2 & 0x0f);
            k = (byte) (b1 & 0x03);

            byte val1 = ((b1 & SIGN) == 0) ? (byte) (b1 >> 2)
                    : (byte) ((b1) >> 2 ^ 0xc0);
            byte val2 = ((b2 & SIGN) == 0) ? (byte) (b2 >> 4)
                    : (byte) ((b2) >> 4 ^ 0xf0);

            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[val1];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[val2
                    | (k << 4)];
            encodedData[encodedIndex++] = LOOKUP_BASE_64_ALPHABET[l << 2];
            encodedData[encodedIndex++] = PAD;
        }

        return new String(encodedData);
    }

    /**
     * Decodes Base64 data into octets
     * 
     * @param encoded
     *            string containing Base64 data
     * @return Array containing decoded data.
     */
    public static byte[] decode(String encoded) throws Exception {

        if (encoded == null) {
            return null;
        }

        char[] base64Data = encoded.toCharArray();
        // remove white spaces
        int len = removeWhiteSpace(base64Data);

        if (len % FOURBYTE != 0) {
            throw new Exception("decoding.divisible.four");
        }

        int numberQuadruple = (len / FOURBYTE);

        if (numberQuadruple == 0) {
            return new byte[0];
        }

        byte decodedData[] = null;
        byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;
        char d1 = 0, d2 = 0, d3 = 0, d4 = 0;

        int i = 0;
        int encodedIndex = 0;
        int dataIndex = 0;
        decodedData = new byte[(numberQuadruple) * 3];

        for (; i < numberQuadruple - 1; i++) {

            if (!isData((d1 = base64Data[dataIndex++]))
                    || !isData((d2 = base64Data[dataIndex++]))
                    || !isData((d3 = base64Data[dataIndex++]))
                    || !isData((d4 = base64Data[dataIndex++]))) {
                throw new Exception("decoding.general");// if found
                                                                  // "no data"
                                                                  // just return
                                                                  // null
            }

            b1 = BASE_64_ALPHABET[d1];
            b2 = BASE_64_ALPHABET[d2];
            b3 = BASE_64_ALPHABET[d3];
            b4 = BASE_64_ALPHABET[d4];

            decodedData[encodedIndex++] = (byte) (b1 << 2 | b2 >> 4);
            decodedData[encodedIndex++] = (byte) (((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
            decodedData[encodedIndex++] = (byte) (b3 << 6 | b4);
        }

        if (!isData((d1 = base64Data[dataIndex++]))
                || !isData((d2 = base64Data[dataIndex++]))) {
            throw new Exception("decoding.general");// if found
                                                              // "no data" just
                                                              // return null
        }

        b1 = BASE_64_ALPHABET[d1];
        b2 = BASE_64_ALPHABET[d2];

        d3 = base64Data[dataIndex++];
        d4 = base64Data[dataIndex++];
        if (!isData((d3)) || !isData((d4))) {// Check if they are PAD characters
            if (isPad(d3) && isPad(d4)) { // Two PAD e.g. 3c[Pad][Pad]
                if ((b2 & 0xf) != 0) {// last 4 bits should be zero
                    throw new Exception("decoding.general");
                }
                byte[] tmp = new byte[i * 3 + 1];
                System.arraycopy(decodedData, 0, tmp, 0, i * 3);
                tmp[encodedIndex] = (byte)(b1 << 2 | b2 >> 4);
                return tmp;
            } else if (!isPad(d3) && isPad(d4)) { // One PAD e.g. 3cQ[Pad]
                b3 = BASE_64_ALPHABET[d3];
                if ((b3 & 0x3) != 0) { // last 2 bits should be zero
                    throw new Exception("decoding.general");
                }
                byte[] tmp = new byte[i * 3 + 2];
                System.arraycopy(decodedData, 0, tmp, 0, i * 3);
                tmp[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4);
                tmp[encodedIndex] = (byte)(((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
                return tmp;
            } else {
                throw new Exception("decoding.general");// an error
                                                                  // like
                                                                  // "3c[Pad]r",
                                                                  // "3cdX",
                                                                  // "3cXd",
                                                                  // "3cXX"
                                                                  // where X is
                                                                  // non data
            }
        }
		b3 = BASE_64_ALPHABET[d3];
		b4 = BASE_64_ALPHABET[d4];
		decodedData[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4);
		decodedData[encodedIndex++] = (byte)(((b2 & 0xf) << 4) | ((b3 >> 2) & 0xf));
		decodedData[encodedIndex++] = (byte)(b3 << 6 | b4);

        return decodedData;
    }

    /**
     * remove WhiteSpace from MIME containing encoded Base64 data.
     * 
     * @param data
     *            the byte array of base64 data (with WS)
     * @return the new length
     */
    protected static int removeWhiteSpace(char[] data) {
        if (data == null) {
            return 0;
        }

        // count characters that's not whitespace
        int newSize = 0;
        int len = data.length;
        for (int i = 0; i < len; i++) {
            if (!isWhiteSpace(data[i])) {
                data[newSize++] = data[i];
            }
        }
        return newSize;
    }
}
