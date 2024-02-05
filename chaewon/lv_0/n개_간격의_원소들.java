package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class n개_간격의_원소들 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
    }

    public static int[] solution(int[] num_list, int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < num_list.length; i+=n) {
            result.add(num_list[i]);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

}
