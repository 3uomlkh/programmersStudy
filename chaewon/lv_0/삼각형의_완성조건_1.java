package lv_0;

import java.util.Arrays;

public class 삼각형의_완성조건_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3}));
        System.out.println(solution(new int[] {3, 6, 2}));
        System.out.println(solution(new int[] {199, 72, 222}));
    }

    public static int solution(int[] sides) {
        Arrays.sort(sides);
        int sum = sides[0] + sides[1];
        return sum > sides[2] ? 1 : 2;
    }
}
