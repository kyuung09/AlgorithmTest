class Solution {
    public String solution(String s) {
        String answer = "";
    
        char[] chars = s.toCharArray();

        int cnt = 0;

        for (char c : chars) {
            if (c == 32) {
                cnt = 0;
                answer += c;
                continue;
            }

            if (cnt == 0 || cnt % 2 == 0) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }

            cnt++;
        }

        return answer;
    }
}