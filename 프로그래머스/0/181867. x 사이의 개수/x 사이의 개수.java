class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] spMyString = myString.split("x",-1);
        int[] len = new int[spMyString.length];

        for(int i=0;i<spMyString.length;i++){
            len[i] = spMyString[i].length();
        }

        return len;
    }


}