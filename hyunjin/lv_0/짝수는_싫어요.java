import java.util.Arrays;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));
    }

    public static int[] solution(int n) {
        int[] answer;
        int count = 0;

        if (n % 2 == 0) {
            answer = new int[n/2];
        } else {
            answer = new int[n/2 + 1];
        }

        for (int i = 1; i <= n; i+=2) {
            answer[count] = i;
            count++;
        }

        return answer;
    }
}
