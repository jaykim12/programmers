class Solution {
    public int solution(int n) {
        int answer = 0;


        if(n % 7 == 0){
            answer = n/7;
        }
        else{
            answer = n/7+1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(15));
    }
}