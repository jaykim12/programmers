class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String myr = myString.replace('A','T').replace('B','A').replace('T','B');
        if(myr.contains(pat)){
            answer =1;
        }
        else{
            answer =0;
        }

        return answer;
    }
}