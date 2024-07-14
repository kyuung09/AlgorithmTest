import java.util.Stack;

public class Solution {
    public int solution(int[] order) {
        Stack<Integer> subContainer = new Stack<>();
        int index = 0;
        
        for (int i = 1; i <= order.length; i++) {
            subContainer.push(i);
            
            while (!subContainer.isEmpty() && subContainer.peek() == order[index]) {
                subContainer.pop();
                index++;
            }
        }
        
        return index;
    }
}
