package lv_0;

import java.util.Comparator;
import java.util.stream.IntStream;

public class 진료순서_정하기 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // 배열을 내림차 순으로 정렬하려면 Integer로 변환하거나 Stream을 사용해야 함.
        // 굳이 내림차 순 배열로 바꾸지 않아도 해결할 수 있는 방법이 있었다. -> 자신보다 큰 값을 count
        int[] sortedArr = IntStream.of(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < sortedArr.length; j++) {
                if (emergency[i] == sortedArr[j]) {
                    answer[i] = j + 1;
                }
            }
        }
        return answer;
    }
}
