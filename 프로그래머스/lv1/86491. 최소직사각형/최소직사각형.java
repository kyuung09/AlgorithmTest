class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int maxW=0;
        int maxH=0;
        int rotateCardMax = 0;
        int rotateCardMin =0;

        for ( int i =0; i < sizes.length; i++){
            rotateCardMax = Math.max(sizes[i][0], sizes[i][1]);
            rotateCardMin = Math.min(sizes[i][0], sizes[i][1]);
            maxW = Math.max(maxW, rotateCardMax);
            maxH = Math.max(maxH, rotateCardMin);
        }
        answer = maxH * maxW;
        return answer;
    }
}