import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
                int[] studentA = {1, 2, 3, 4, 5};
        int[] studentB = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] studentC = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] totalGrade = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if (studentA[i % 5] == answers[i]) {
                totalGrade[0] += 1;
            }
            if (studentB[i % 8] == answers[i]) {
                totalGrade[1] += 1;
            }
            if (studentC[i % 10] == answers[i]) {
                totalGrade[2] += 1;
            }
        }

            List<Integer> list = new ArrayList<Integer>();
            int maxScore = Math.max(totalGrade[0], totalGrade[1]);
            maxScore = Math.max(maxScore, totalGrade[2]);

            if (maxScore == totalGrade[0]) {
                list.add(1);
            }
            if (maxScore == totalGrade[1]) {
                list.add(2);
            }
            if (maxScore == totalGrade[2]) {
                list.add(3);
            }
            int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
            return answer;
        } 
    }