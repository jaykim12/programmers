class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(5, 24));
    }

    public String solution(int a, int b) {
        String answer = "";

        String[] weeks = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

        int targetDay = dateToDays(a, b); // 0
        answer = weeks[targetDay % 7];
        return answer;
    }

    // 2016-mm-yy 가 2016년의 몇번째 날인지 구하는 메소드
    static int dateToDays(int month, int day) {
        int sum = 0;
        for (int m = 0; m < month; m++) {

            // 31일인 달을 지날 경우
            if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10) {
                sum += 31;
            }

            // 2월을 지날 경우
            else if (m == 2) {
                sum += 29;
            }

            // 30일인 달을 지날 경우
            else if (m == 4 || m == 6 || m == 9 | m == 11) {
                sum += 30;
            }
        }
        sum += (day - 1);
        return sum;
    }
}