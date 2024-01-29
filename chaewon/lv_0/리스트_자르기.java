package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트_자르기 {
    public static void main(String[] args) {
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(solution(3, slicer, num_list)));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> result = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int start = a;
        int end = b;
        int gap = 1;

        switch (n) {
            case 1:
                start = 0;
                break;
            case 2:
                end = num_list.length - 1;
                break;
            case 3:
                break;
            case 4:
                gap = c;
                break;
        }

        for (int i = start; i <= end; i+=gap) result.add(num_list[i]);
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) answer[i] = result.get(i);

        return answer;
    }
}
