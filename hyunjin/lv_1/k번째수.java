import java.util.Arrays;

public class k번째수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] copyArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArr);

            answer[i] = copyArr[commands[i][2] - 1];
        }

        return answer;
    }
}
