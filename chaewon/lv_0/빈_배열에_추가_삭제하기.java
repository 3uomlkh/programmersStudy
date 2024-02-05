package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 빈_배열에_추가_삭제하기 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(solution(arr, flag)));
    }

    public static int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) result.add(arr[i]);
            } else {
                int index = result.size() - 1;
                for (int j = 0; j < arr[i]; j++) {
                    result.remove(index--);
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
