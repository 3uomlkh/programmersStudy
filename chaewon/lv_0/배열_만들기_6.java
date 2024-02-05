package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_만들기_6 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 0, 1, 0})));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 0})));
    }

    // Hint - Stack을 이용해보기
    public static int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else {
                if (stk.get(stk.size() - 1) == arr[i]) {
                    stk.remove(stk.size() - 1);
                } else {
                    stk.add(arr[i]);
                }
            }
        }

        if (stk.isEmpty()) stk.add(-1);

        int[] answer = new int[stk.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stk.get(i);
        }

        return answer;
    }
}
