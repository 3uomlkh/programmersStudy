package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의_원소_삭제하기 {
    public static void main(String[] args) {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr, delete_list)));
    }

    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i : arr) arrList.add(i);

        for (int i = 0; i < delete_list.length; i++) {
            if (arrList.contains(delete_list[i])) arrList.remove(Integer.valueOf(delete_list[i]));
        }

        int[] answer = new int[arrList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrList.get(i);
        }

        return answer;
    }
}
