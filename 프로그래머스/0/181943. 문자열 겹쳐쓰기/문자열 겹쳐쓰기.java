class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        answer = my_string.substring(0,s) + overwrite_string+ my_string.substring(s+overwrite_string.length(),my_string.length());


        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("He11oWor1d","lloWorl",2));
    }
}