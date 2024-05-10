package lv_1;

public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        System.out.println(solution(13, 17));
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int aliquot = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) aliquot++;
            }
            if (aliquot % 2 == 0) answer += i;
            else answer -= i;
        }

        // 다른 풀이 : i가  제곱수로 나누어떨어질 경우 약수의 개수가 홀수

        return answer;
    }
}
