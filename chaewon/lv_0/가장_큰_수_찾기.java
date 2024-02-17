package lv_0;

import java.util.Arrays;

public class 가장_큰_수_찾기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 8, 3})));
    }

    public static int[] solution(int[] array) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }

        int[] answer = {max, index};

        return answer;
    }
}
