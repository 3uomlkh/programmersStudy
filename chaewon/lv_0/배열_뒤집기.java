package lv_0;

import java.util.Arrays;

public class 배열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 1, 1, 1, 2})));
        System.out.println(Arrays.toString(solution(new int[]{1, 0, 1, 1, 1, 3, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int index = 0;

        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[index++] = num_list[i];
        }

        return answer;
    }
}
