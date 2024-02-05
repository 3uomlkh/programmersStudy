package lv_0;

import java.util.Arrays;

public class 길이에_따른_연산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
        System.out.println(solution(new int[] {2, 3, 4, 5}));
    }

    public static int solution(int[] num_list) {
        int answer = 1;
        if (num_list.length >= 11) return Arrays.stream(num_list).sum();
        else {
            for (int j : num_list) {
                answer *= j;
            }
        }

        return answer;
    }
}
