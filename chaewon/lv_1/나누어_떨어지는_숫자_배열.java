package lv_1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
    }

    public static int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) result.add(arr[i]);
        }

        int[] answer = new int[!result.isEmpty() ? result.size() : 1];
        if (result.isEmpty()) {
            answer[0] = -1;
            return answer;
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}
