package lv_0;

import java.util.Arrays;

public class 배열의_길이에_따라_다른_연산하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{49, 12, 100, 276, 33}, 27)));
        System.out.println(Arrays.toString(solution(new int[]{444, 555, 666, 777}, 100)));
    }

    public static int[] solution(int[] arr, int n) {
        if (arr.length % 2 == 0) {
            for (int i = 1; i < arr.length; i+=2) arr[i] += n;
        } else {
            for (int i = 0; i < arr.length; i+=2) arr[i] += n;
        }

        return arr;
    }
}
