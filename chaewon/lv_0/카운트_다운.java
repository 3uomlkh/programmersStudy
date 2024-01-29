import java.util.Arrays;

public class 카운트_다운 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 3)));
    }

    public static int[] solution(int start, int end_num) {
        final int SIZE = start - end_num + 1;
        int[] answer = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            answer[i] = start;
            start--;
        }
        return answer;
    }

}
