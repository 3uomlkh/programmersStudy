package lv_2;

public class 피보나치_수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        return fibonacci(n) % 1234567;
        // 1234567로 나눈 나머지를 출력하는 이유?
        // 피보나치 수는 엄청나게 빠르게 증가 -> int로 표현할 수 있는 범위를 넘기기 쉬움, 따라서 1234567이라는 큰 숫자로 나눈 나머지를 저장
        // (A + B) % C의 값은 ((A % C) + (B % C)) % C와 같다는 성질을 기억!
    }

    // 재귀로 푸니 테스트 7번 ~ 14번이 시간초과가 남 -> 이전에 계산한 값을 불러와 사용하는 DP로 풀어야 하는 문제!
    public static int fibonacci(int n) {
        int[] cache = new int[n + 1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = (cache[i - 1] + cache[i - 2]) % 1234567;

        }

        return cache[n];
    }
}
