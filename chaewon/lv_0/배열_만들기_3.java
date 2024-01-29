package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열_만들기_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }

    public static int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> my_list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int a = intervals[i][0];
            int b = intervals[i][1];
            for (int j = a; j <= b; j++) {
                my_list.add(arr[j]);
            }
        }

        int[] answer = new int[my_list.size()];
        for (int i = 0; i < my_list.size(); i++) {
            answer[i] = my_list.get(i);
        }

        return answer;
    }

}
