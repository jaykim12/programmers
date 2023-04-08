import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        System.out.println(Arrays.toString(sol.solution(new int []{5, 9, 7, 10}, 5)));
//        System.out.println(Arrays.toString(sol.solution(new int []{2, 36, 1, 3}, 1)));
//        System.out.println(Arrays.toString(sol.solution(new int []{3, 2, 6}, 10)));
//    }

    public int[] solution(int[] arr, int divisor) {

        List<Integer> real = new ArrayList<>();

        // arr에서 divisor로 나누어 떨어지는 element의 갯수 구하기
        for(int i=0;i<arr.length;i++){
            if(arr[i] % divisor == 0){

                real.add(arr[i]);
            }
        }

        // cnt = 0, divisor로 나누어 떨어지는 element가 없을 경우
        if(real.size() ==0){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        // divisor로 나누어 떨어지는 elements가 있을 경우
        int[] answer = new int[real.size()]; // 배열 선언, 사이즈를 정해줘야 함.
        for(int i=0;i<real.size();i++){
            answer[i] = real.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}