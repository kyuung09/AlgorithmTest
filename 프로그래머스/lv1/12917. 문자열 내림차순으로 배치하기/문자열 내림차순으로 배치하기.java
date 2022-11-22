import java.util.Arrays;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String[] splitWord = s.split("");
        // 정렬을 위해서 한글자씩 자름
        Arrays.sort(splitWord, Collections.reverseOrder());

        // Arrays.sort로 정렬시 대문자가 소문자보다 큰걸로 판별
        // 반대로 뒤집기 ( 소문자 > 대문자 )

        String answer = "";

        for (int i = 0; i < splitWord.length; i++) {
            answer += splitWord[i];
            System.out.println(answer);
        }
        return answer;
    }
}