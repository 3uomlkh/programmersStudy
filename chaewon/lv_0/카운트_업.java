import java.util.Arrays;

public class 카운트_업 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 10)));
    }

    public static int[] solution(int start_num, int end_num) {
        final int SIZE = end_num - start_num + 1;
        int[] answer = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            answer[i] = start_num;
            start_num ++;
        }

        return answer;
    }
}
