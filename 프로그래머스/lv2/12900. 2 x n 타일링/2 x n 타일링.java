class Solution {
    public int solution(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;                          // 가로 길이가 1일때의 경우의 수
        dp[2] = 2;                          // 가로 길이가 2일때의 경우의 수

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000007;
        }

        return dp[n];
    }
}