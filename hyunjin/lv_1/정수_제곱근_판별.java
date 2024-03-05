public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        long answer = 0;

        for (long i = 1; i <= n; i++) {
            if (n / i == i && n % i == 0) {
                answer = (i + 1) * (i + 1);
                break;
            } else {
                answer = -1;
            }
        }

        return answer;
    }
}
