import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 이의_영역 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) two.add(i);
        }

        if (!two.isEmpty()) {
            Collections.sort(two);
            for (int i = two.get(0); i <= two.get(two.size() - 1); i++) {
                result.add(arr[i]);
            }
        } else {
            result.add(-1);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = result.get(i);

        return answer;
    }

}
