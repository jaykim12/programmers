class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String [] cip = cipher.split("");
        for(int i=code-1;i<cip.length;i = i+code){
            answer = answer + cip[i];
        }
        return answer;
    }
}