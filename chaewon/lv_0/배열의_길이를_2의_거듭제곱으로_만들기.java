package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6})));
        System.out.println(Arrays.toString(solution(new int[]{58, 172, 746, 89})));
    }

    // 헷갈린 문제 - 다시 풀어보기
    public static int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr) result.add(i);

        int pow = 0;
        int size = result.size();
        for (int i = 0; i < 11; i++) {
            if(size <= Math.pow(2, i)) {
                pow = i;
                break;
            }
        }

        if (size == Math.pow(2, pow)) {
            return arr;
        } else {
            for (int i = 0; i < Math.pow(2, pow) - size; i++) {
                result.add(0);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
