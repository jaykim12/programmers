class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("pPoooyY"));
        System.out.println(sol.solution("Pyy"));
    }

    boolean solution(String s) {
        boolean answer = true;
        int cnt =0;
        String[] s1 =  s.split("");
        for(int i=0;i<s1.length;i++){
            if(s1[i].equals("p") || s1[i].equals("P")){
                cnt++;
            }
            else if(s1[i].equals("y") || s1[i].equals("Y")){
                cnt--;
            }
        }

        if(cnt == 0){
            answer =true;
        }
        else{
            answer = false;
        }



        return answer;
    }
}
