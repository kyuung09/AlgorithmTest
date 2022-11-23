import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int left, int right) {
int answer = 0;

        int size = right - left + 1;
        System.out.println(size);

        int[] newArr = new int[size];

        List<Integer> hol = new ArrayList<Integer>();
        List<Integer> zzak = new ArrayList<Integer>();

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] += left;
            left += 1;
        }

        for (int i = 0; i < newArr.length; i++) {
            int cnt = 0;
            for (int j = 1; j <= newArr[i]; j++) {
                if (newArr[i] % j == 0) {
                    cnt += 1;}
            } if (cnt % 2 == 1) {
                hol.add(newArr[i]);
            }else {
                zzak.add(newArr[i]);
            }
        }

        int holsum = 0;
        for (int i=0; i<hol.size(); i++){
            holsum -= hol.get(i);
        }

        int zzaksum = 0;
        for (int i=0; i<zzak.size(); i++){
            zzaksum += zzak.get(i);
        }

        int sum=zzaksum+holsum;
        System.out.println(sum);
        return sum;
    }
}