class Solution {
    public int[] solution(long n) {
        String nStr = ""+n;

        StringBuffer tp = new StringBuffer(nStr);
        String reverse = tp.reverse().toString();

        char[] rChar = reverse.toCharArray();  // char 배열로 변환
        int[] answer = new int[rChar.length];

        // char를 int로 바꿔서 다시 출력함 Character의 getNumericValue(char ch) 이용
        int i=0; // 인덱스용
        for(char c : rChar){
            answer[i++] = Character.getNumericValue(c);
        } return answer;
    }
}