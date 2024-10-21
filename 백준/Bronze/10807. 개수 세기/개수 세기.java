import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //정수 개수
        int num = scanner.nextInt();
        int cnt = 0;

        //주어지는 정수 배열
        int k[] = new int[num];
        for(int i=0;i<k.length;i++){
            k[i] = scanner.nextInt();
        }
        int key =scanner.nextInt();

        for(int i=0;i<k.length;i++){
            if(k[i] == key){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}