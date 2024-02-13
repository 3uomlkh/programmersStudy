package lv_0;

import java.util.Arrays;

public class 최댓값_만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5}));
        System.out.println(solution(new int[] {0, 31, 24, 10, 1, 9}));
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers); // 배열을 오름차순으로 정렬
        return numbers[numbers.length - 1] * numbers[numbers.length - 2]; // 제일 마지막 요소와 마지막에서 두번째 요소 곱하기
    }
}
