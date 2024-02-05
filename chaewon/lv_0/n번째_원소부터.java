package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class n번째_원소부터 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 3)));
    }

    public static int[] solution(int[] num_list, int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = n - 1; i < num_list.length; i++) {
            result.add(num_list[i]);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    // Arrays.copyOfRange() 사용해보기

}
