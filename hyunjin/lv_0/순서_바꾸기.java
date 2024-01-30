import java.util.ArrayList;
import java.util.List;

public class 순서_바꾸기 {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i=n; i<num_list.length; i++) {
            answer.add(i-n, num_list[i]);
            count++;
        }
        for (int j=0; j<n; j++) {
            answer.add(count, num_list[j]);
            count++;
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
