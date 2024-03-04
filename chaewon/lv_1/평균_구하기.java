package lv_1;

import java.util.Arrays;

public class 평균_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));
    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int i : arr) {
            answer += i;
        }

        return answer / arr.length;

        // stream을 사용해 한 줄로 구해보자!
//        return Arrays.stream(arr).average().getAsDouble();
    }
}
