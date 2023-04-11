class Solution {
    public long solution(long n) {
        long answer = 0;

        int num_sqrt = (int) Math.sqrt(n);
        long cha = n - (long)Math.pow(num_sqrt,2);

        if(cha == 0 ){
            answer = (long)Math.pow(num_sqrt +1,2);
        }
        else{
            answer = -1;
        }

        return answer;
    }
}