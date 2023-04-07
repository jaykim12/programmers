class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long xnumber = x;
         answer[0] = xnumber;

        for(int i=1;i<answer.length;i++){
           
            
            answer[i] = answer[i-1] + xnumber;


        }
        return answer;
    }
}
