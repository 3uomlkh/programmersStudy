package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class n의_배수_고르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }

    public static int[] solution(int n, int[] numList) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : numList) {
            if (num % n == 0) result.add(num);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
