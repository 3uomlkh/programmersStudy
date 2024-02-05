import java.util.ArrayList;
import java.util.List;

public class _2의_영역 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int min = 100000, max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        if (min <= max) {
            for (int i=min; i<=max; i++) {
                answer.add(i-min, arr[i]);
            }
        } else {
            answer.add(-1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
