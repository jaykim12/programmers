class Solution {
    public int solution(String s) {

        int answer = 0;
        String[] split_s = s.split(" ");

        for(int i=0;i<split_s.length;i++){
            if(split_s[i].equals("Z") ){
                answer  = answer-Integer.parseInt(split_s[i-1]);

            }
            else{
                answer = answer+Integer.parseInt(split_s[i]);
            }

        }





        return answer;
    }
}