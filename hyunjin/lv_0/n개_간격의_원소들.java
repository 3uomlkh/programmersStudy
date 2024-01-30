import java.util.ArrayList;
import java.util.List;

public class n개_간격의_원소들 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();

        for (int i=0; i<num_list.length; i+=n) {
            answer.add(i/n, num_list[i]);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}
