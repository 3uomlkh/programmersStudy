package lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 두_개_뽑아서_더하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 3, 4, 1})));
    }

    public static int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!arr.contains(numbers[i] + numbers[j])) { // 중복된 숫자가 없을 경우 추가
                    arr.add(numbers[i] + numbers[j]);
                }
            }
        }

        Collections.sort(arr); // 오름차순 정렬
        int[] answer = new int[arr.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr.get(i);
        }

        return answer;
    }
}
