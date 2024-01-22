package lv_00;

public class 홀짝에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 2; i <= n; i+=2) {
                answer += i*i;
            }
        } else {
            for (int i = 1; i <= n; i+=2) {
                answer += i;
            }
        }

        return answer;
    }
}
