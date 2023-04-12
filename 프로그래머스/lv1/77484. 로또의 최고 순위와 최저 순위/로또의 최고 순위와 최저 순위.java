import java.util.*;


class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2]; // lottos = {44, 1, 0, 0, 31, 25}, win_nums = { 31, 10, 45, 1, 6, 19 }
        // 0의 개수를 구한다. 또는 0이 아닌 숫자들로만 배열 혹은 리스트를 만든다.
        int cnt_Zero = 0;
        int cnt_NotZero = 0;
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] != 0) {
                list.add(lottos[i]);
            } else if (lottos[i] == 0) {
                cnt_Zero++;
            }
        }
        //리스트를 배열로 변환
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i).intValue();
        }


        // lottos에서 0이 아닌 숫자들이 win_nums에 몇 개 들어있는지 세어준다.
        // list = { 44, 1, 31, 25 }

        for (int i = 0; i < win_nums.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (win_nums[i] == arr[j]) {
                    cnt_NotZero++;
                }

            }

        }


        // win_nums에 들어있던 숫자 개수 + 0의 총 개수 -> 최고 등수
        // 6개 맞추면 1등 , 5개 2등, 4개 3등 , 3개 4등 , 2개 5등, 1개 or 0개 6등(낙첨)
        //당첨된숫자 + 0으로 적힌 숫자도 맞힌다면 >> 최고 등수 >> 5등부터 최고등수가 될 수 있음
        if (cnt_Zero + cnt_NotZero == 6) {
            answer[0] = 1;
        } else if (cnt_Zero + cnt_NotZero == 5) {
            answer[0] = 2;
        } else if (cnt_Zero + cnt_NotZero == 4) {
            answer[0] = 3;
        } else if (cnt_Zero + cnt_NotZero == 3) {
            answer[0] = 4;
        } else if (cnt_Zero + cnt_NotZero == 2) {
            answer[0] = 5;
        }
        else if(cnt_Zero + cnt_NotZero == 1 || cnt_Zero+cnt_NotZero == 0){
            answer[0] = 6;
        }


        // win_nums에 들어있던 숫자 개수 -> 최저 등수
        if (cnt_NotZero == 6) {
            answer[1] = 1;
        } else if (cnt_NotZero == 5) {
            answer[1] = 2;
        } else if (cnt_NotZero == 4) {
            answer[1] = 3;
        } else if (cnt_NotZero == 3) {
            answer[1] = 4;
        } else if (cnt_NotZero == 2) {
            answer[1] = 5;
        } else if (cnt_NotZero == 1 || cnt_NotZero == 0) {
            answer[1] = 6;
        }


        // answer에 추가해주기

        return answer;
    }
}