import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j=i+1; j < numbers.length; j++) {
                int sum= numbers[i]+numbers[j];
                list.add(sum);
            }
        }
        Set<Integer> set = new HashSet<Integer>(list);
        
        List<Integer>lists = new ArrayList<Integer>(set);
        lists.sort(Comparator.naturalOrder());
        
        answer = lists.stream()
                    .mapToInt(i -> i)
                    .toArray();

        return answer;
    }
}