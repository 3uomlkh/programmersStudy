import java.util.ArrayList;
import java.util.List;

public class n_번째_원소까지 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i=0; i<n; i++) {
            answer.add(i, num_list[i]);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
