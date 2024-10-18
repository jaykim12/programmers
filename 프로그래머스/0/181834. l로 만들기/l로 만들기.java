class Solution {
    public String solution(String myString) {
        String answer = "";
       //1. String 배열을 char 배열로 만든다.
        StringBuilder ans = new StringBuilder();
        for(char c : myString.toCharArray()){
            ans.append(c>'l' ? c : 'l');
        }
        answer = ans.toString();



        return answer;
    }
}