import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(45));
    }
    public int solution(int n) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        while(n != 0){
            list.add(n%3);
            n = n/3;
        }

        for(int i = 0; i < list.size(); i++){
            // i=0, list=0, 0 * 10^3, 0 * 10^0
            // i=1, list=0, 0 * 10^2, 0 * 10^1
            // i=2, list=2, 2 * 10^1, 0 * 10^2
            // i=3, list=1, 1 * 10^0, 0 * 10^3
            //              --------- = 7
            answer += list.get(i) * Math.pow(3, list.size() - 1 - i);
        }
        return answer;
    }
}