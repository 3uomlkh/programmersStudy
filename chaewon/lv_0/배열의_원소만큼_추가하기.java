package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의_원소만큼_추가하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 1, 4})));
        System.out.println(Arrays.toString(solution(new int[]{6, 6})));
        System.out.println(Arrays.toString(solution(new int[]{1})));
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) arrlist.add(i);
        }
        int[] answer = new int[arrlist.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = arrlist.get(i);
        return answer;
    }
}
