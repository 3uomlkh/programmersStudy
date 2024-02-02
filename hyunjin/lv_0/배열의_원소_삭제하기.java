import java.util.ArrayList;
import java.util.List;

public class 배열의_원소_삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean chk = true;
            for (int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) chk = false;
            }
            if(chk)answer.add(arr[i]);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
