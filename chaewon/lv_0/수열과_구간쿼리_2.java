package lv_0;

import java.util.Arrays;

public class 수열과_구간쿼리_2 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    // 힌트를 많이 보고 풀었던 문제 - 다시 풀어보기
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0 ; i < queries.length ; i++) {
            int min = 1000000;
            int cnt = 0;
            for(int j = queries[i][0] ; j <= queries[i][1] ; j++) {
                if (arr[j] > queries[i][2] && min > arr[j]) min = arr[j];
                else cnt++;
            }
            if(queries[i][1] - queries[i][0] + 1 == cnt) answer[i] = -1;
            else answer[i] = min;
        }
        return answer;
    }
}
