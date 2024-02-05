import java.util.Arrays;

public class 무작위로_K개의_수_뽑기 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        int[] resultArr = Arrays.stream(arr).distinct().toArray();
        int len = resultArr.length;

        for (int i = 0; i < answer.length; i++) {
            if (len != 0) {
                len--;
                answer[i] = resultArr[i];
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
