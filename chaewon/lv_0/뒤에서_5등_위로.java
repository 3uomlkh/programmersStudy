package lv_0;

import java.util.Arrays;

public class 뒤에서_5등_위로 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int index = 0;

        Arrays.sort(num_list);

        for (int i = 5; i < num_list.length; i++) answer[index++] = num_list[i];
        return answer;
    }
}
