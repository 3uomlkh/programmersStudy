package lv_0;

import java.util.Arrays;
import java.util.HashSet;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));
    }

    public static int[] solution(int n) {
        HashSet<Integer> set = new HashSet<>(); // 중복된 값을 없애기 위해 HashSet 사용

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                set.add(i);
            }
        }

        // Stream을 사용해 Set -> int[] 변환
        int[] answer = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.sort(answer); // HashSet은 중복도 없고 순서도 없으므로 오름차순으로 정렬해줌

        return answer;
    }
}
