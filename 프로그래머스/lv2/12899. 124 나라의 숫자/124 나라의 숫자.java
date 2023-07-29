class Solution {
    public String solution(int n) {
        if(n==0){
            return"";
        }

        int remainder=n%3;
        int quotient=n/3;

        if(remainder==0){
            quotient--;
        }

        return solution(quotient)+convertTo(remainder);
    }
    
    public static String convertTo(int num){
        if(num==0){
            return"4";
        }else if(num==1){
            return"1";
        }else{
            return"2";
        }
    }
}