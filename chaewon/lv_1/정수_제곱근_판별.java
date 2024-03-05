package lv_1;

public class 정수_제곱근_판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        long answer = 0;

        for (long i = 0; i*i <= n; i++) {
            if (i*i == n) answer = (i + 1) * (i + 1);
            else answer = -1;
        }

        // Math를 사용해 푸는 다른 방법
//        if (Math.pow((int) Math.sqrt(n), 2) == n) {
//            return (long) Math.pow(Math.sqrt(n) + 1, 2);
//        }
//        return -1;

        return answer;
    }
}
