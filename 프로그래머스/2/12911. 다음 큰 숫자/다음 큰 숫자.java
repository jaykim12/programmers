class Solution {
    public int solution(int n) {
        int answer = 0;
        int bin_cnt = Integer.bitCount(n);
        int bin_cnt2 = 0;

        while (true){
            n++;
            bin_cnt2 = Integer.bitCount(n);
            if(bin_cnt == bin_cnt2){
                break;
            }
        }


        return n;
    }
}