import java.util.Arrays;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;

        if (n % 7 == 0) {
            answer = n / 7;
        } else {
            answer = n / 7 + 1;
        }

        return answer;
    }
}
