import java.util.*;
class Solution {
//    public static void main(String[] args) {
//        Solution test = new Solution();
//        System.out.println(test.solution(118372L));
//
//    }
    public long solution(long n) {
        int cnt = 1;
        while (true) {
            if (((long) Math.pow(10, cnt)) > n) {
                break;
            } else {
                cnt++;
            }
        }

        int[] arr = new int[cnt];
        for (int i = 0; i < cnt; i++) {
            arr[i] = (int) (n % 10);
            n /= 10;
        }
        Arrays.sort(arr);

        long answer = 0;
        for (int i = 0; i < cnt; i++) {
            answer += (Math.pow(10, i) * arr[i]);
        }
        return answer;
    }
}