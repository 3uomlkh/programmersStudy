package lv_0;

import java.util.Arrays;

public class 직사각형_넓이_구하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new int[][]{{1, 1}, {2, 1}, {2, 2}, {1, 2}}));
    }

    public static int solution(int[][] dots) {
        int x = dots[0][0];
        int y = dots[0][1];
        int width = 0;
        int height = 0;

        for (int i = 1; i < dots.length; i++) {
            if (x != dots[i][0]) width = Math.abs(x - dots[i][0]);
            if (y != dots[i][1]) height = Math.abs(y - dots[i][1]);
        }

        return width * height;
    }
}
