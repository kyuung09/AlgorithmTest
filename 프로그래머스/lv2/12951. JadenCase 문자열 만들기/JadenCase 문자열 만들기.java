class Solution {
    public String solution(String s) {
        String answer = "";

        String[] s_split = s.split(" ");

        for (int i = 0; i < s_split.length; i++) {

            if (s_split[i].length() == 0) {
                answer += " ";
            } else {
                answer += s_split[i].substring(0, 1).toUpperCase();
                answer += s_split[i].substring(1).toLowerCase();
                answer += " ";
            }
        }
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        // 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);
    }
}