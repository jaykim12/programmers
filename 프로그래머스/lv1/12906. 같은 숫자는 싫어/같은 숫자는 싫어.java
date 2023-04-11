
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{1,1,1,13,3,3}));

    }
    public int[] solution(int []arr) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        int num =-5;// arr[i] = 0~9까지니까 0~9가 아닌 수 선언


        for(int i=0;i<arr.length;i++){
            if(num != arr[i]){
                list.add(arr[i]);//첫 num은 -5로 arr[i]랑 다르니까 무조건 실행되어 list에 arr[0]이 삽입
               num = arr[i];//num은 arr[0]으로 바뀌고 다시올라간다. 만약 arr[1]이 arr[0]가 같다면 list에 삽입을 안한다.
                //num은 arr[0]인 상태로 arr[2]랑 비교를 한다. arr[0]과 arr[2]가 다르다면 리스트에 arr[2]삽입후 num도 arr[2]가된다.
            }


        }
        //list에는 arr[i]에 숫자비교를 한 값들이 삽입
        //리스트를 일반 배열로 변환 작업.



        return list.stream().mapToInt(i->i).toArray();
    }
}