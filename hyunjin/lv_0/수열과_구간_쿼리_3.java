public class 수열과_구간_쿼리_3 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i = 0; i < queries.length; i++) {
            int n = arr[queries[i][1]];
            arr[queries[i][1]] = arr[queries[i][0]];
            arr[queries[i][0]] = n;
        }
        return arr;
    }
}
