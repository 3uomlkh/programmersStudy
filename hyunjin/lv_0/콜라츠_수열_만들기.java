import java.util.*;
public class 콜라츠_수열_만들기 {
    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        while(true) {
            list.add(n);
            if(n == 1 ) {break;}
            else if(n % 2 == 0) { n/=2;}
            else if(n % 2 != 0) {n = 3*n +1;}
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
