import java.util.Arrays;
import java.util.List;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        //알파벳 순으로 비교해야 하니 sort 사용
        Arrays.sort(participant);
        Arrays.sort(completion);



        for(int i=0;i<completion.length;i++){

            //참여자 명단에는 있지만 완료 명단에는 없는
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;


            }
            //완료 명단의 길이는 참여자 명단의 길이보다 1작다.

        }
        if(answer.equals("")){
            answer = participant[participant.length-1];
       
        }
        //if문?? answer가 비어있으면 마지막 참여명단을 넣어준다.



        return answer;
    }
}