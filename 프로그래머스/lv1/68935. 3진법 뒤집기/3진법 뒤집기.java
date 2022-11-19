class Solution {
    public int solution(int n) {
        int answer = 0;
        String convertList= "";

        while ( n > 0){
            convertList += n % 3;
            n /= 3;
        }

        answer = Integer.parseInt(convertList,3);
        
        return answer;
    }
}