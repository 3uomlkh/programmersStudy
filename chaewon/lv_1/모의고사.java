package lv_1;

import java.util.ArrayList;
import java.util.Arrays;

public class 모의고사 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
    }

    public static int[] solution(int[] answers) {
        int[] supoza1 = {1, 2, 3, 4, 5};
        int[] supoza2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] supoza3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] result = new int[3];

        // i % supoza1.length 부분을 생각해내지 못해서 틀린 문제!
        // answer의 길이가 수포자의 배열들보다 길 경우를 생각해야 한다.
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supoza1[i % supoza1.length]) result[0]++;
            if (answers[i] == supoza2[i % supoza2.length]) result[1]++;
            if (answers[i] == supoza3[i % supoza3.length]) result[2]++;
        }

        int max = result[0];
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i < result.length; i++) {
            if (max < result[i]) {
                max = result[i];
                arr.remove(0);
                arr.add(i + 1);
            } else if (max == result[i]) {
                arr.add(i + 1);
            }
        }

        int[] answer = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
