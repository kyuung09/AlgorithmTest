class Solution {
    public int[] solution(long n) {
    
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] chr = reversed.toCharArray();

        int[] answer = new int[chr.length];

        for (int i = 0 ; i < answer.length; i++){
            answer[i] = chr[i] - '0';
        }
        
        return answer;
    }
}