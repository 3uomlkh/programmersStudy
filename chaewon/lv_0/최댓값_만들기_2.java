package lv_0;

import java.util.*;

public class 최댓값_만들기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, -3, 4, -5}));
        System.out.println(solution(new int[] {0, -31, 24, 10, 1, 9}));
        System.out.println(solution(new int[] {10, 20, 30, 5, 5, 20, 5}));
    }

    public static int solution(int[] numbers) {
        HashSet<Integer> numbers2 = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) numbers2.add(numbers[i] * numbers[j]);
            }
        }

        return Collections.max(numbers2);
    }
}
