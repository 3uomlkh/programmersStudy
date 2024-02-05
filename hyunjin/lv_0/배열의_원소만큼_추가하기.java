import java.util.ArrayList;
import java.util.List;

public class 배열의_원소만큼_추가하기 {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer.add(count, arr[i]);
                count++;
            }
        }

        return answer;
    }
}
