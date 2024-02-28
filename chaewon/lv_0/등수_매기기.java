package lv_0;

import java.util.*;

public class 등수_매기기 {
    public static void main(String[] args) {
        System.out.println();
    }

    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        Double[] sortedAverage = new Double[score.length];

        for (int i = 0; i < score.length; i++) {
            sortedAverage[i] = (score[i][0] + score[i][1]) / 2.0;
            average[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        Arrays.sort(sortedAverage, Collections.reverseOrder());
        double[] sorted = Arrays.stream(sortedAverage).mapToDouble(i -> i).toArray();

        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] == sortedAverage[j]) {
                    answer[i] = (int) j + 1;

                    break;
                }
            }
        }

        return answer;
    }
}
