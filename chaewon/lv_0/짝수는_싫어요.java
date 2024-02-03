package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                arr.add(i);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        // stream() 이용해 ArrayList를 배열로 만들기
//        arr.stream().mapToInt(x -> x).toArray();

        return answer;
    }
}
