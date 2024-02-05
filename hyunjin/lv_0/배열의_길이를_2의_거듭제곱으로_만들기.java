import java.util.Arrays;

public class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public int[] solution(int[] arr) {
        int n = arr.length;
        int targetLength = 1;

        while (targetLength < n) {
            targetLength *= 2;
        }

        int[] answer = new int[targetLength];
        Arrays.fill(answer, 0);

        System.arraycopy(arr, 0, answer, 0, n);

        return answer;
    }
}
