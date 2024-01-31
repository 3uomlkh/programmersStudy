package lv_0;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 100, 99, 98}, 3)));
    }

    public static int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (k % 2 == 0) {
                answer[i] = arr[i] + k;
            } else {
                answer[i] = arr[i] * k;
            }
        }

        return answer;
    }
}
