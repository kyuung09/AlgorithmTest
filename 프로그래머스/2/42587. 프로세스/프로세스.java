import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
Queue<Integer> queue = new LinkedList<>();

        for (int priority : priorities) {
            queue.offer(priority);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean isPrinted = true;

            for (int element : queue) {
                if (current < element) {
                    isPrinted = false;
                    break;
                }
            }

            if (isPrinted) {
                answer++;

                if (location == 0) {
                    break;
                } else {
                    location--;
                }
            } else {
                queue.offer(current);

                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location--;
                }
            }
        }

        return answer;
    }
}