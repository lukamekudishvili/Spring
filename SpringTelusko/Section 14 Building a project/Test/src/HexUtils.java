public class HexUtils {
    private static final char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String toHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        int resultByte;
        for (int j = 0; j < bytes.length; j++) {
            resultByte = bytes[j] & 0xFF;
            System.out.println(resultByte);
            hexChars[j * 2] = hexArray[resultByte >>> 4];
            hexChars[j * 2 + 1] = hexArray[resultByte & 0x0F];
        }
        return new String(hexChars);
    }

    public static byte[] toBytes(String hex) {
        int hexLength = hex.length();
        byte[] resultBytes = new byte[hexLength / 2];
        for (int i = 0; i < hexLength; i += 2) {
            resultBytes[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4) + Character
                    .digit(hex.charAt(i + 1), 16));
        }
        return resultBytes;
    }
}
