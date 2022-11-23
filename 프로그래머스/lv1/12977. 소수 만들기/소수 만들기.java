class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
          for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    // 모든 경우의수를 구하기위해서 삼중 for문을 사용
                    int sum = nums[i] + nums[j] + nums[k];
                    // num i + num j(i+1) + num k(j+1)을 더해서
                    if (check(sum)) {
                        // check 메소드를 만들어서 sum값을 넣어서 호출한다.
                        answer++;
                    }
                }
            }
        } return answer;
    }

   public static boolean check(int sum) {
        for (int i = 2; i < sum; i++) {
            // 1은 나눠볼 필요 없으므로, 2부터 시작하는 반복문을 돌린다
            if (sum % i == 0)
                return false;
            // i로 나누었을때 나누어떨어지면 소수 아니므로 false를 리턴하고
        } return true;
        // i로 나누었을때 나누어 떨어지지 않으면 true
        
    }
}