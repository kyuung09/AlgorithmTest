class Solution {
    public int solution(int num) {
        long n = num;
        int cnt = 0;

        while ( true ) {
            if ( n == 1 ) break;
            // n == 1 일경우 중단

            if ( n % 2 == 0){
                n /= 2;
                cnt++;
            }else {
                n = (n * 3) + 1;
                cnt++;
            }
        }

        if(cnt <= 500){
            return cnt;
        }else {
            cnt = -1;
            return cnt;
        }
    }
}