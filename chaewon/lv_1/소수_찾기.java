package lv_1;

public class 소수_찾기 {
    static int answer = 0;
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {

        for (int i = 1; i <= n; i++) {
            isPrime(i);
        }

        return answer;
    }

    public static void isPrime(int n) {
        if (n < 2) return;
        if (n == 2) {
            answer++;
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return;
        }
        answer++;
    }
}
