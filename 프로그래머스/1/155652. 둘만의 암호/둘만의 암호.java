class Solution {
    // 1. 문자열 S를 S의 길이만큼 for문 -> 각 알파벳 원소 아스키코드 +index
    // 2.뒤로 넘긴 알파벳이 z넘어가면 a로 돌아감
    //3. skip에 있는 알파벳은 제외후 건너뜀
    public String solution(String s, String skip, int index) {
        String answer = "";


        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for(int j=0;j<index;j++){
                c +=1;
                if(c > 'z'){
                    c-=26;
                }
                if(skip.contains(String.valueOf(c))){
                    j--;
                }
            }
            answer +=c;
        }


        return answer;
    }
}