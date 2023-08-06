class Solution {
    public static long solution(int n) {
        long[] dp = new long[5001];
        int mod = 1000000007;
        
        dp[0] = 1;
        dp[2] = 3;
        
        for (int i = 4; i <= n; i += 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = i - 4; j >= 0; j -= 2) {
                dp[i] += dp[j] * 2;
                dp[i] %= mod;
            }
        }
        
        return dp[n];
        
    }
}