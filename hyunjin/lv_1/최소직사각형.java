public class 최소직사각형 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5,15}}));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        for (int i = 0; i < sizes.length; i++) {
            maxW = Math.max(maxW, sizes[i][0]);
            maxH = Math.max(maxH, sizes[i][1]);
        }

        answer = maxW * maxH;

        return answer;
    }
}
