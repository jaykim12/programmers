class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println( test.solution(11));

    }
    public boolean solution(int x) {
        int sum = 0;
        int num = x;
        while (x != 0) {  // 21,2
            sum += x % 10; // sum = 0 + 1;sum = 1+2;
            x /= 10; //  >> x = 2 ; x = 0;
        }

        boolean answer = (num % sum == 0) ? true : false;
        
        return answer;
    }
}