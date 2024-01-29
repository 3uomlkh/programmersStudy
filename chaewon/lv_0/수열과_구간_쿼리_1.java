package lv_0;

import java.util.Arrays;

public class 수열과_구간_쿼리_1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            for (int j = s; j <= e; j++) arr[j]++;
        }
        return arr;
    }
}
