package lv_0;

import java.util.Arrays;

// 풀이 보고 푼 문제
public class 연속된_수의_합 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
    }

    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int mid = total / num;
        int sub = total % num == 0 ? num / 2 : (num / 2) - 1;
        int start = mid - sub;

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }

        return answer;

    }
}
