package lv_0;

public class 공_던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}, 2));
    }

    // 잘 안풀려서 답을 보고 푼 문제
    public static int solution(int[] numbers, int k) {
        return numbers[((k - 1) * 2) % numbers.length];
    }
}
