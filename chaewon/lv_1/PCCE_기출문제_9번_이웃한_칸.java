package lv_1;

public class PCCE_기출문제_9번_이웃한_칸 {
    public static void main(String[] args) {
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
        System.out.println(solution(board, h, w));
    }

    public static int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int checkH = h + dh[i];
            int checkW = w + dw[i];

            if (checkH < 0 || checkH >= n || checkW < 0 || checkW >= n) continue;
            if (board[h][w].equals(board[checkH][checkW])) answer++;
        }

        return answer;
    }
}
