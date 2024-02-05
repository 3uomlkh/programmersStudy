import java.util.ArrayList;
import java.util.List;

public class n_번째_원소부터 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i=n-1; i<num_list.length; i++) {
            answer.add(i-n+1, num_list[i]);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
