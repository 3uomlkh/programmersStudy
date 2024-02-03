package lv_0;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
        System.out.println(solution(new int[] {9, -1, 0}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}
