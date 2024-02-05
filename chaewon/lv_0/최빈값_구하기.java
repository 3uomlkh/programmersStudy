package lv_0;

import java.util.Arrays;

public class 최빈값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 3, 3, 4}));
        System.out.println(solution(new int[] {1, 1, 2, 2}));
        System.out.println(solution(new int[] {1}));
    }

    public static int solution(int[] array) {
        Arrays.sort(array); // 오름차순 정렬
        int answer = 0;
        int max = array[array.length - 1]; // 가장 큰 원소를 max 변수에 대입

        int[] numbers = new int[max + 1]; // 각 원소의 개수를 받을 배열
        for (int i = 0; i < array.length; i++) {
            numbers[array[i]]++; // 해당 원소 값 자리 값 1씩 증가
        }

        max = numbers[0]; // numbers 배열에서 0번째 값(0의 빈도수) 먼저 대입
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) { // 가장 빈도수가 많은 인덱스를 찾기
                max = numbers[i];
                answer = i;
            } else if (numbers[i] == max) answer = -1; // 최빈값이 여러 개일 경우
        }

        return answer;
    }
}
