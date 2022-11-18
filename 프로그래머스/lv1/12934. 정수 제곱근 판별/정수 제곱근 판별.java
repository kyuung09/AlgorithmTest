import java.util.*;

class Solution {
    public long solution(long n) {
        Double n_value= Math.sqrt(n);

        if (n_value == n_value.intValue()){
            return (long)Math.pow(n_value +1, 2);
             
        }else{
            return -1;
        }
    }
}