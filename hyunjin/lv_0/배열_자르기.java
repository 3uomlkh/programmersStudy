import java.util.Arrays;

public class 배열_자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
        System.out.println(Arrays.toString(solution(new int[]{1, 3, 5}, 1, 2)));
    }

    public static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        answer = Arrays.copyOfRange(numbers, num1, num2 + 1);

        return answer;
    }
}
