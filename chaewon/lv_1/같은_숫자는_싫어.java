package lv_1;

import java.util.*;

public class 같은_숫자는_싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
    }

    // Stack과 Queue 메서드 익혀두기
    public static int[] solution(int []arr) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int num : arr) {
            if (stack.isEmpty() || stack.peek() != num) {
                stack.push(num);
            }
        }

        int[] answer = new int[stack.size()];
        // Stack이므로 거꾸로 채워 넣어야 함
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
