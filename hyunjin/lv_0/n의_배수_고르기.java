import java.util.ArrayList;
import java.util.List;

public class n의_배수_고르기 {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12}));
        System.out.println(solution(5, new int[]{1, 9, 3, 10, 13, 5}));
        System.out.println(solution(12, new int[]{2, 100, 120, 600, 12, 12}));
    }

    public static List<Integer> solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer.add(count, numlist[i]);
                count++;
            }
        }

        return answer;
    }
}
