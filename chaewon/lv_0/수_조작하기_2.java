package lv_0;

import java.util.Arrays;

public class 수_조작하기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1}));
    }

    public static String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] == numLog[i-1] + 1) {
                answer += 'w';
            } else if (numLog[i] == numLog[i - 1] - 1) {
                answer += 's';
            } else if (numLog[i] == numLog[i - 1] + 10) {
                answer += 'd';
            } else if (numLog[i] == numLog[i - 1] - 10) {
                answer += 'a';
            }
        }

        return answer;
    }
}
