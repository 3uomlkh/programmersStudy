package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 약수_구하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }

    public static int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer.add(i);
        }

        return answer.stream().mapToInt(i->i).toArray(); // ArrayList를 int 배열로 변환하는 법 기억하기!
    }
}
