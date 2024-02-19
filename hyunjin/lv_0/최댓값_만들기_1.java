import java.util.Arrays;

public class 최댓값_만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solution(new int[]{0, 31, 24, 10, 1, 9}));
    }
    public static int solution(int[] numbers) {
        int answer = 0;
        int num = numbers.length;

        Arrays.sort(numbers);

        answer = numbers[num - 1] * numbers[num - 2];

        return answer;
    }
}
