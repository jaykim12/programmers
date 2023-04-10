public class Solution {
    public int solution(int n) {
        int answer = 0;
        String num_string = Integer.toString(n);
        int[] num_array = new int[num_string.length()];
        for(int i=0;i<num_array.length;i++){
            num_array[i] = num_string.charAt(i)-'0';
            answer = answer +num_array[i];
        }
        



        return answer;
    }
}