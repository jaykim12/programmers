class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(626331));
    }
    public int solution(int num) {
        int answer = 0;

        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;

            } else if (num % 2 == 1) {
                num = (num * 3) + 1;
            }
            answer++;
            if(answer == 500){
                answer = -1;
                break;
            }



        }


        return answer;
    }
}