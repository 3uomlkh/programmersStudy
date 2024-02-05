public class 수열과_구간_쿼리_1 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();

        for (int i=0; i<queries.length; i++) {
            for (int j=0; j<answer.length; j++) {
                if (j >= queries[i][0] && j <= queries[i][1]) {
                    answer[j]++ ;
                }
            }
        }

        return answer;
    }
}
