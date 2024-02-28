package lv_0;

import java.util.*;

public class 등수_매기기 {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score)));
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length]; // 평균이 정수가 아닐 수도 있다는 점 생각
        Double[] sortedAverage = new Double[score.length];

        for (int i = 0; i < score.length; i++) {
            sortedAverage[i] = (score[i][0] + score[i][1]) / 2.0;
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        Arrays.sort(sortedAverage, Collections.reverseOrder());

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] == sortedAverage[j]) {
                    answer[i] = j + 1;

                    break;
                }
            }
        }

        return answer;
    }
}
