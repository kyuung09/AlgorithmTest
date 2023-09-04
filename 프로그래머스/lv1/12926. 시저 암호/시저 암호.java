class Solution {
    public static String solution(String s, int n) {

        char[] chr = s.toCharArray();
        StringBuilder builder = new StringBuilder();

        for (char c : chr){
            builder.append(pushAlphabat(c, n));
        }
        return builder.toString();
    }

    private static char pushAlphabat(char c, int n) {

        if (!(c >= 'A' && c <= 'Z') && !(c >= 'a' && c <= 'z')) {
            return c;
        }

        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        int position = c - offset;

        position = (position + n) % ('Z' - 'A' + 1);

        c = (char) (position + offset);

        return c;

    }
}