import java.util.*;

class Solution {
    public static void main(String[] args) {
        Solution test = new Solution();
        System.out.println(test.solution(new int[]{2,1,3,4,1}));
    }
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        //서로 다른 인덱스에 있는 두수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순 담는다.


        for(int i=0;i< numbers.length;i++){
            int num =0;
            for(int j=i+1;j<numbers.length;j++){
                num = numbers[i]+numbers[j]; // numbers 배열에서 인덱스 두개를 골라 더해 num에 넣는다.

//                if(list.indexOf(num) < 0){// num요소가 없다면 list에 num을 넣어라.
//                    list.add(num);
//                }
                if(!list.contains(num)){
                    list.add(num);
                }
            }

        }
        //list -> 배열로 변환 후 sort해준다.
        int answer[] = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(answer);



        return answer;
    }
}