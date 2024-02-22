package lv_0;

public class 안전지대 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
    }

    public  static int solution(int[][] board) {
        int[][] newBoard = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    int overX = newBoard.length; // 행의 개수
                    int overY = newBoard[0].length; // 열의 개수

                    newBoard[i][j] = 1;
                    if (i > 0) newBoard[i-1][j] = 1; // 위에 공간이 있다면 한 칸 올라가서 1로 채우기
                    if (i < overX - 1) newBoard[i+1][j] = 1; // 아래에 공간이 있다면 한 칸 내려가서 1로 채우기
                    if (j < overY - 1) newBoard[i][j+1] = 1; // 오른쪽에 공간이 있다면 오른쪽으로 이동 후 1로  채우기
                    if (j > 0) newBoard[i][j-1] = 1; // 왼쪽에 공간이 있다면 왼쪽으로 이동 후 1로 채우기
                    if (i > 0 && j > 0) newBoard[i-1][j-1] = 1; // 왼쪽 대각선 위 1로 채우기
                    if (i > 0 && j < overY - 1) newBoard[i-1][j+1] = 1; // 오른쪽 대각선 위 1로 채우기
                    if (i < overX - 1 && j > 0) newBoard[i+1][j-1] = 1; // 왼쪽 대각선 아래 1로 채우기
                    if (i < overX - 1 && j < overY - 1) newBoard[i+1][j+1] = 1; // 오른쪽 대각선 아래 1로 채우기
                }
            }
        }

        int answer = 0;
        for (int[] ints : newBoard) {
            for (int i : ints) {
                if (i == 0) answer++;
            }
        }

        return answer;
    }
}
