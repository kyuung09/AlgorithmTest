class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while (num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            
            ++answer;
            if (answer >= 480) return -1;
        }
        
        return answer;
    }
}