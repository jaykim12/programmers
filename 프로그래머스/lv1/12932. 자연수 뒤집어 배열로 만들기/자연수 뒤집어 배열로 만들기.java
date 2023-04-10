class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(123455));
    }
    public int[] solution(long n) {
        String st = Long.toString(n);

        int [] answer = new int[st.length()];
        int ansindex = 0;



        for(int i= st.length()-1;i>=0;i--){

            answer[ansindex] = st.charAt(i)-48;
            ansindex++;









        }

        return answer;
    }
}