import java.util.ArrayList;
import java.util.List;

public class 할_일_목록 {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        int count = 0;

        for (int i=0; i<finished.length; i++) {
            if (finished[i] == false) {
                answer.add(count, todo_list[i]);
                count++;
            }
        }

        return answer;
    }
}
