import java.util.ArrayList;
import java.util.List;

public class 빈_배열에_추가_삭제하기 {
    public List<Integer> solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < flag.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    answer.remove(answer.size() - 1);
                }
            }
        }

        return answer;
    }
}
