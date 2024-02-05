import java.util.Arrays;

public class 배열_두_배_만들기 {
    public static void main(String[] args) {

        int[] arr2 = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution(arr2)));
    }

    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
