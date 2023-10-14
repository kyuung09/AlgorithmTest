import java.util.*;

class Solution
{
    public int solution(String s)
    {
        LinkedList<Character> stack = new LinkedList<>();

    for (char c : s.toCharArray()) {
        if (!stack.isEmpty() && stack.peek() == c) {
            stack.pop(); // 스택에서 현재 문자를 제거
        } else {
            stack.push(c); // 스택에 현재 문자를 추가
        }
    }

    if (stack.isEmpty()) {
        return 1;
    } else {
        return 0;
    }
    }
}