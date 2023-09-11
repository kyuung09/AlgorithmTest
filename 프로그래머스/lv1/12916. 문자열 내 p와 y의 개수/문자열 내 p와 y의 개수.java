class Solution {
    boolean solution(String s) {
        int yCnt = 0;
        int pCnt = 0;

        for (String n : s.split("")) {
            if (n.equalsIgnoreCase("y")) {
                yCnt++;
            } else if (n.equalsIgnoreCase("p")) {
                pCnt++;
            }
        }

        return yCnt == pCnt;
    }
}