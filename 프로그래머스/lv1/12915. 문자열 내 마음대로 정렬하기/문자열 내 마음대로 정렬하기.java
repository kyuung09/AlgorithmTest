import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        String[] stringSort = new String[strings.length];
        
        for(int i=0;i<strings.length;i++) {
            stringSort[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(stringSort);

        for (int i=0; i<strings.length; i++){
            answer[i] = stringSort[i].substring(1);
        }
        
        return answer;
    }
}