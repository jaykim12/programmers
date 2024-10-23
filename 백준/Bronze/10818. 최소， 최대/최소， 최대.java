import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();






        int[] nums = new int[N];

        for(int i=0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(min > nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);












    }

}