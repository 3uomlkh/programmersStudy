package lv_0;

import java.util.Arrays;

public class 특별한_이차원_배열_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(solution(3)));
        System.out.println(Arrays.deepToString(solution(6)));
        System.out.println(Arrays.deepToString(solution(1)));
    }

    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (i == j) {
                    answer[i][j] = 1;
                }
            }
        }

        // 더 간단한 다른 풀이
//        for (int i = 0; i < n; i++) {
//            answer[i][i] = 1;
//        }

        return answer;
    }
}
