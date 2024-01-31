package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 무작위로_K개의_수_뽑기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 2, 2, 3}, 3)));
        System.out.println(Arrays.toString(solution(new int[]{0, 1, 1, 1, 1}, 4)));
    }

    public static int[] solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!answer.contains(arr[i])) {
                answer.add(arr[i]);
            }

            if (answer.size() == k) break;
        }

        if (answer.size() < k) {
            for (int i = answer.size(); i < k; i++) {
                answer.add(-1);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
