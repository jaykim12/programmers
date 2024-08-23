import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int[] arr) {
        int[] answer = {};
        List<Integer> stk = new ArrayList<>();

        int i = 0;


        while (i < arr.length) {

            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i++;
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                    i++;
                }
                else{
                    stk.add(arr[i]);
                    i++;
                }
            }

            }

          
            if(stk.size() == 0){
                stk.add(-1);
            }




        return stk;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[] {0,1,1,1,0}));
    }
}