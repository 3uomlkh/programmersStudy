package lv_2;

public class 숫자의_표현 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution2(15));
    }

    public static int solution(int n) {
        int answer = 0;
        int sum;

        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = i; j <= n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) break;
            }
        }

        return answer;
    }

    // 다른 풀이 - 정수론 : 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수 == 주어진 수의 홀수 약수의 개수
    public static int solution2(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer++;
        }

        return answer;
    }
}
