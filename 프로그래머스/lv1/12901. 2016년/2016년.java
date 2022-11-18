class Solution {
    public String solution(int a, int b) {
        int[] monthsDay = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int totalDate = 0;
        for (int i =0; i < a-1; i++){
            totalDate += monthsDay[i];
        }
        totalDate += b-1;

        String answer = day[totalDate % 7];

        return answer;
    }
}