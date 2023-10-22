import java.util.HashSet;
import java.util.Set;


class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = new int[2];
        int cnt = 0;
        Set<String> usedWords = new HashSet<>();
        String prevWord = "";

        for (int i = 0; i < words.length; i++) {
            cnt++;
            if (usedWords.contains(words[i]) || (!prevWord.isEmpty() && prevWord.charAt(prevWord.length() - 1) != words[i].charAt(0))) {
                result[0] = (cnt - 1) % n + 1;
                result[1] = (cnt - 1) / n + 1;
                return result;
            } else {
                usedWords.add(words[i]);
                prevWord = words[i];
            }
        }

        return result;
    }
}