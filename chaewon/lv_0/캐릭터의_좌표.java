package lv_0;

import java.util.Arrays;

public class 캐릭터의_좌표 {
    public static void main(String[] args) {
        String[] keyInput = {"left", "right", "up", "right", "right"};
        int[] board = {11, 11};
        System.out.println(Arrays.toString(solution(keyInput, board)));
    }

    public static int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int maxWidth = (board[0] - 1) / 2;
        int maxHeight = (board[1] - 1) / 2;

        for (String key : keyinput) {
            switch (key) {
                case "up":
                    if (answer[1] == maxHeight) continue;
                    answer[1]++;
                    break;
                case "down":
                    if (answer[1] == -maxHeight) continue;
                    answer[1]--;
                    break;
                case "left":
                    if (answer[0] == -maxWidth) continue;
                    answer[0]--;
                    break;
                case "right":
                    if (answer[0] == maxWidth) continue;
                    answer[0]++;
                    break;
            }
        }

        if (Math.abs(answer[0]) > maxWidth) {
            if (answer[0] > 0) {
                answer[0]--;
            } else {
                answer[0]++;
            }
        } else if (Math.abs(answer[1]) > maxHeight) {
            if (answer[1] > 0) {
                answer[1]--;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}
