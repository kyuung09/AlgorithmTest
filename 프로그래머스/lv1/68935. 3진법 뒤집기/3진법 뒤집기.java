class Solution {
    public int solution(int n) {
        String answer = new StringBuilder(Integer.toString(n,3)).reverse().toString();
        return Integer.valueOf(answer, 3);
    }
}