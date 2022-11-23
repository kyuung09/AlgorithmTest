import java.util.*;

class Solution {
    public long solution(long n) {
        
        // Double n_value= Math.sqrt(n);
        long n_value = (long)Math.sqrt(n);
        long njg = (long)Math.pow(n_value, 2);
        
        if (n == njg){
            return (long)Math.pow(n_value +1, 2);
             
        }else{
            return -1;
        }
    }
}