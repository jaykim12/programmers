 class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            int first;
            int sec;
            first = Integer.valueOf((String.valueOf(a)) + (String.valueOf(b)));
            sec = 2*a*b;
            if(first >= sec){
                answer = first;
            }
            else{
                answer = sec;
            }

            return answer;
        }
    }