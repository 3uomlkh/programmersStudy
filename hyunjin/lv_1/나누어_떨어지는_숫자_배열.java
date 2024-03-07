import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 9, 7, 10}, 5));
        System.out.println(solution(new int[]{2, 36, 1, 3}, 1));
        System.out.println(solution(new int[]{3, 2, 6}, 10));
    }

    public static List<Integer> solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer.add(count, arr[i]);
                count++;
            }
        }

        Collections.sort(answer);

        if (answer.size() == 0) {
            answer.add(0, -1);
        }

        return answer;
    }
}
