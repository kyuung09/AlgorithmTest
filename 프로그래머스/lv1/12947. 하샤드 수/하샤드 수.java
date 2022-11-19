import java.util.stream.Stream;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0 ;
        int[] numArray = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        
        if (numArray.length < 2) {
            sum = numArray[0];
        }else if(numArray.length < 3){
            sum = numArray[0] + numArray[1];
        }else if(numArray.length < 4){
            sum = numArray[0] + numArray[1] + numArray[2];
        }else if(numArray.length < 5){
            sum = numArray[0] + numArray[1] + numArray[2] + numArray[3];
        }
        

        if (x % sum == 0){
            answer = true;
            return answer;
        }else{
            answer = false;
            return answer;
        }
    }
}