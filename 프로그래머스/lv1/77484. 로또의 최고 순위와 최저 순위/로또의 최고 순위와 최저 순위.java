class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {

        int cnt = 0;
        int zeroCnt = 0;

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            } if ( 0 == lottos[i]){
                zeroCnt ++;
            }
        }
        int[] answer = {cnt, zeroCnt};
        answer[0] = Math.min(7-(cnt + zeroCnt), 6);
        answer[1] = Math.min(7-cnt, 6);
        return answer;
    } 
}