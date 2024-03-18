package lv_1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }


    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] hallOfFameScores = new int[k];

        for (int i = 0; i < score.length; i++) {
            if (i < k) {
                hallOfFameScores[0] = score[i];
                Arrays.sort(hallOfFameScores);
                answer[i] = hallOfFameScores[k-i-1];
            } else {
                if (score[i] >= hallOfFameScores[0]) hallOfFameScores[0] = score[i];
                Arrays.sort(hallOfFameScores);
                answer[i] = hallOfFameScores[0];
            }
        }

        return answer;
    }

    // PriorityQueue로 푸는 방법도 공부해보기
    public static int[] solution2(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < score.length; i++) {

            priorityQueue.add(score[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
