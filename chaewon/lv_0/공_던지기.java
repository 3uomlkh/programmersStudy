package lv_0;

public class 공_던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}, 2));
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6}, 5));
    }

    // 잘 안풀려서 답을 보고 푼 문제
    public static int solution(int[] numbers, int k) {
        /* 배열을 일렬로 세운 인덱스를 배열의 길이로 나누기
           1(1번째) -> 2 -> 3(2번째) -> 4 -> 5(3번째) -> 1 -> 2(4번째) -> 3 -> 4(5번째) -> 5
            [0]             [2]             [4]              [6]             [8] ----> 8 % 5 = [3]번째 인덱스와 같음!
         */
        return numbers[((k - 1) * 2) % numbers.length];
    }
}
