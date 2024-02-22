package lv_0;

import java.util.Arrays;

public class 삼각형의_완성조건_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2}));
    }

    public static int solution(int[] sides) {
        int a = 0;
        int b = 0;

        Arrays.sort(sides);

        // 가장 긴 변이 배열에 있을 경우 : sides[sides.length - 1] < 나머지 한 변 + 작은 변  && sides[sides.length - 1] > i
        for (int i = 1; i <= sides[1]; i++) {
            if (sides[1] < sides[0] + i) a++;
        }

        // 나머지 한 변이 가장 긴 변인 경우 : sides[sides.length - 1] < 나머지 한 변 < sides의 원소 합
        for (int i = sides[1] + 1; i < sides[0] + sides[1]; i++) b++;

        return a + b;
    }
}
