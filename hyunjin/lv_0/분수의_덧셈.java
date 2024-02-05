import java.util.Arrays;

public class 분수의_덧셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int numer = 0;
        int denom = 0;
        int num = 0;

        numer = numer1 * denom2 + numer2 * denom1;
        denom = denom1 * denom2;

        for (int i = 1; i <= numer; i++) {
            if (numer % i == 0 && denom % i == 0) {
                answer[0] = numer / i;
                answer[1] = denom / i;
            }
        }

        return answer;
    }
}
