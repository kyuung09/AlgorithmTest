import java.util.Arrays;
import java.util.Collections;


class Solution {
    public String solution(String s) {
              if(s.length() == 1){
            return s;
        }

        String[] arr = s.split("");
        Arrays.sort(arr);
        String str = "";
        for(int i=arr.length-1; i>=0; i--){
            str += arr[i];
        }
        return str;

    }
}