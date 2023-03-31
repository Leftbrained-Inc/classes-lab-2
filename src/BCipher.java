// Algorithm, that encodes by the A - Z, B - Y (reverse) rule
public class BCipher implements ICipher {
    public char[] LatinAlphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    char[] reverse = new StringBuilder(new String(LatinAlphabet)).reverse().toString().toCharArray();

    public String encode(String e) {
        char[] encodedMsg = e.toCharArray();
        for (int index = 0; index < encodedMsg.length; index++) {
            if (Character.isLowerCase(encodedMsg[index])) {
                encodedMsg[index] = reverse[encodedMsg[index] - 'a'];
            } else if (Character.isUpperCase(encodedMsg[index])) {
                encodedMsg[index] = Character.toUpperCase(reverse[encodedMsg[index] - 'A']);
            }
        }

        return new String(encodedMsg);
    }

    // Due to algorithm, the reverse action is identical
    public String decode(String c) {
        return encode(c);
    }
}
