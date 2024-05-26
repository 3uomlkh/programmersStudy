package lv_2;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
        System.out.println(solution(new int[] {70, 80, 50}, 100));
        System.out.println(solution(new int[] {20, 60, 70, 80, 30}, 100));
    }

    // 답을 보고 푼 문제 - 다시 풀기
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = people.length - 1;
        int j = 0;

        while (i > j) {
            if (people[i] + people[j] <= limit) { // 가장 작은 몸무게 + 가장 큰 몸무게 > limit이라면, 가장 큰 몸무게를 가진 사람을 혼자 태워 보냄.
                // 뒤에서 한 칸씩, 앞에서 한 칸씩 이동
                i--;
                j++;
            } else {
                // 무게 제한을 초과한다면 뒤만 이동(무거운 사람 pass)
                i--;
            }
        }
        // j의 수만큼 쌍이 만들어진 것
        return people.length - j;
    }
}
