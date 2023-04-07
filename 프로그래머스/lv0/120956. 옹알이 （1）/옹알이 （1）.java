

class Solution {
    public int solution(String[] babbling) {

        int answer = 0;
        for(int i=0;i<babbling.length;i++){
           babbling[i] = babbling[i].replaceFirst("aya","p");
           babbling[i] = babbling[i].replaceFirst("ye","p");
           babbling[i] = babbling[i].replaceFirst("woo","p");
           babbling[i] = babbling[i].replaceFirst("ma","p");
           babbling[i] = babbling[i].replace("p","");


           if(babbling[i].length() == 0){
               answer++;
           }





        }
        return answer;
    }
}
