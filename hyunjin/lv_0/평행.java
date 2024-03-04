public class 평행 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 4}, {9, 2}, {3, 8}, {11, 6}}));
        System.out.println(solution(new int[][]{{3, 5}, {4, 1}, {2, 4}, {5, 10}}));
    }

    public  static int solution(int[][] dots) {
        int answer = 0;

        double a = (double) (dots[0][1] - dots[1][1]) / (dots[0][0] - dots[1][0]);
        double b = (double) (dots[2][1] - dots[3][1]) / (dots[2][0] - dots[3][0]);

        if (a - b == 0) {
            answer = 1;
        }

        double c = (double) (dots[0][1] - dots[2][1]) / (dots[0][0] - dots[2][0]);
        double d = (double) (dots[1][1] - dots[3][1]) / (dots[1][0] - dots[3][0]);

        if (c - d == 0) {
            answer = 1;
        }

        double e = (double) (dots[0][1] - dots[3][1]) / (dots[0][0] - dots[3][0]);
        double f = (double) (dots[1][1] - dots[2][1]) / (dots[1][0] - dots[2][0]);

        if (e - f == 0) {
            answer = 1;
        }

        return answer;
    }
}
