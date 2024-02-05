package lv_0;

import java.util.Arrays;

public class 수열과_구간_쿼리_4 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1},{0, 3, 2},{0, 3, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) { // queries의 행의 길이만큼 반복
            for (int j = queries[i][0]; j <= queries[i][1]; j++) { // s <= j <= e
                if (j % queries[i][2] == 0) arr[j]++; // j가 k의 배수라면 arr[i]에 1을 더함
            }
        }

        return arr;
    }
}
