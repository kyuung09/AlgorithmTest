import java.util.Arrays;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;       
        String sum = "";
        String page = "" + n;
        String[] pagen = page.split("");
        Arrays.sort(pagen, Collections.reverseOrder());

        for (int i=0; i < pagen.length; i++ ){
            sum += pagen[i];
            answer = Long.parseLong(sum);
        }return answer;
    }  
}