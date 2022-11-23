import java.util.Arrays;
class Solution {
    public int solution(int[] d, int budget) {
        int cnt=0;
        
         Arrays.sort(d);

        for (int i=0; i<d.length; i++){
            int result = budget - d[i];
             if ( result >= 0 ){
                budget -= d[i];
                cnt ++;
            }else {
                break;
            }
        }
        System.out.println(cnt);

        return cnt;
    }
}