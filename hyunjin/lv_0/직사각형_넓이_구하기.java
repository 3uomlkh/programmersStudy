public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
        System.out.println(solution(new int[][]{{-1, -1}, {1, 1}, {1, -1}, {-1, 1}}));
    }

    public static int solution(int[][] dots) {
        int answer = 0;
        int x = 0;
        int xMax = -256;
        int xMin = 256;
        int y = 0;
        int yMax = -256;
        int yMin = 256;

        for (int i = 0; i < 4; i++) {
            xMax = Math.max(dots[i][0], xMax);
            xMin = Math.min(dots[i][0], xMin);
            yMax = Math.max(dots[i][1], yMax);
            yMin = Math.min(dots[i][1], yMin);
        }

        x = xMax - xMin;
        y = yMax - yMin;
        answer = x * y;

        return answer;
    }
}
