package lv_1;

import java.util.Arrays;

public class 예산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 3, 2, 5, 4}, 9));
    }

    public static int solution(int[] d, int budget) {
        int answer = 0;
        int total = 0;

        Arrays.sort(d);

        for (int num : d) {
            total += num;
            if (total <= budget) answer++;
        }

        return answer;
    }
}
