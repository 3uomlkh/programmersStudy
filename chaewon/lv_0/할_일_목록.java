import java.util.ArrayList;
import java.util.Arrays;

public class 할_일_목록 {
    public static void main(String[] args) {
        String[] todo_list = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] finished = {true, false, true, false};
        System.out.println(Arrays.toString(solution(todo_list, finished)));
    }

    public static String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                result.add(todo_list[i]);
            }
        }

        String[] answer = new String[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
