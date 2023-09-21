class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        int prefix = 0;

        for (char c : s.toCharArray()) {
            if (c == 32) {
                prefix = 0;
            } else {
                c = prefix == 0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
                prefix++;
            }
            builder.append(c);
        }
        
        return builder.toString();
    }
}