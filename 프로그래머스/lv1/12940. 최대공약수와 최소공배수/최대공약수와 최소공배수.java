class Solution {
    public int[] solution(int n, int m) {
        
        int gcd = getGCD(n, m);
        int gsd = (n * m) / gcd;

        int[] answer = {gcd, gsd};


        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        } return answer;
    }

        private int getGCD ( int n, int m){
            if (n % m == 0) {
                return m;
            }
            return getGCD(m, n % m);
        }    
}
