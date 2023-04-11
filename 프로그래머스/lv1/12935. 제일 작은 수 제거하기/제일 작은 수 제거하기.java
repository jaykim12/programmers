import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = new int[]{3, 4, 1, 2}; // {3, 4, 2}

        // return : {3, 4, 2}
        System.out.println(Arrays.toString(sol.solution(arr)));
    }

    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        int minValue = list.get(0);
        int minIndex = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minValue) {
                minValue = list.get(i); // 최소값
                minIndex = i; // 최소값이 있는 위치
            }
        }
        list.remove(minIndex);

        int[] answer = new int[list.size()];

        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}