package lv_1;

import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(solution(new int[]{10})));
    }

    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        int index = 0;

        if (arr.length == 1) {
            return new int[] {-1};
        }

        for (int i : arr) {
            if (min > i) min = i;
        }

        for (int j : arr) {
            if (min != j) {
                answer[index] = j;
                index += 1;
            }
        }

        return answer;
    }
}
