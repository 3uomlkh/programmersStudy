package lv_1;

import java.util.*;

public class K번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        ArrayList<Integer> arr = new ArrayList<>();

        int index = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            for (int l = i - 1; l < j; l++) {
                arr.add(array[l]);
            }
            Collections.sort(arr);
            answer[index++] = arr.get(k-1);
            arr.clear();
        }
        // Arrays.copyOfRange()를 이용해 푸는 방법도 생각해보기
        // 정렬 직접 구현해보기

        return answer;
    }
}
