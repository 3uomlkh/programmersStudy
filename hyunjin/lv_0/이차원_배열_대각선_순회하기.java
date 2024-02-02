public class 이차원_배열_대각선_순회하기 {
    public int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k - i; j++) {
                if (i < board.length && j < board[i].length) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }
}
