import java.util.Scanner;

class Main {
    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      
      int test = scanner.nextInt();
      
      if(test<=100 && test>=90){
          System.out.println('A');
      }
      else if(test<= 89 && test>=80){
          System.out.println('B');
      }
      else if(test<=79 && test>=70){
          System.out.println('C');
      }
      else if(test<=69 && test>=60){
          System.out.println('D');
      }
      else{
          System.out.println('F');
      }

    





    }

}