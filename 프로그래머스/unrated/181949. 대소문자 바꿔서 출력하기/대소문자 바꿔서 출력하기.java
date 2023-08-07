import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String result = "";

        for(int i =0;i<a.length();i++){
            char ac = a.charAt(i);
            if(Character.isUpperCase(ac)){
                result = result + Character.toLowerCase(ac);
            }
            else{
                result = result + Character.toUpperCase(ac);
            }
        }
        System.out.println(result);

    }
}