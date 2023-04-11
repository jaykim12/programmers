import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[][]{
                {10,7},
                {12,3},
                {8,15},
                {14,7},
                {5,15}
        }));

        }
    public int solution(int[][] sizes) {

        int row_max =1;
        int col_minmax =1;
        int longest =0;
        int shortest = 0;

        for(int i=0;i<sizes.length;i++){
            longest = Math.max(sizes[i][0],sizes[i][1]); //가장 긴 길이
            shortest = Math.min(sizes[i][0],sizes[i][1]);//가장 짧은 길이


            if(longest > row_max){
                row_max = longest; // 가장 긴길이를 가로에
            }
            if(shortest >col_minmax){
                col_minmax =shortest;//가장 짧은길이중 가장 긴 길이를 세로에
            }




        }
        int answer = row_max*col_minmax;

        return answer;
    }
}
