package lv_1;

import java.util.Arrays;

public class 과일_장수 {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution(k, m, score));
    }

    public static int solution(int k, int m, int[] score) {
        int[][] boxes = new int[score.length / m][m];
        Arrays.sort(score); // [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4] 으로 정렬

        int idx = score.length - 1;
        for (int[] box : boxes) {
            for (int j = 0; j < m; j++) {
                box[j] = score[idx--]; // [[4, 4, 4], [4, 4, 4], [2, 2, 2], [2, 1, 1]]으로 배열 완성
            }
        }

        int answer = 0;
        for (int[] box : boxes) {
            answer += box[box.length - 1] * m; // 각 배열의 가장 마지막 부분(최저 사과 점수) * 한 상자에 담긴 사과 개수
        }

        return answer;
    }

    // 더 간결한 풀이
    public static int solution2(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score); // [1, 1, 2, 2, 2, 2, 4, 4, 4, 4, 4, 4] 으로 정렬

        for (int i = score.length; i >= m; i-=m) {
            answer += score[i - m] * m; // 0, 3, 6, 9번째 인덱스의 값 이용
        }

        return answer;
    }
}
