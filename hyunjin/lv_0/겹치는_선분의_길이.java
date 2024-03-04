public class 겹치는_선분의_길이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));
        System.out.println(solution(new int[][]{{-1, 1}, {1, 3}, {3, 9}}));
        System.out.println(solution(new int[][]{{0, 5}, {3, 9}, {1, 10}}));
    }

    public static int solution(int[][] lines) {
        int answer = 0;
        int[] check = new int[200];

        for (int i = 0; i < 3; i++) {
            int start = lines[i][0] + 100;
            int end = lines[i][1] + 100;

            for (int j = start; j < end; j++) {
                check[j]++;
            }
        }

        for (int k = 0; k < check.length; k++) {
            if (check[k] > 1) {
                answer++;
            }
        }

        return answer;
    }
}
