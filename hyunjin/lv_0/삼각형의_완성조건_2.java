import java.util.Arrays;

public class 삼각형의_완성조건_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{7, 11}));
    }

    public static int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        int max = sides[1];
        int min = sides[0];

        int low_range = max - min;
        int high_range = max + min;

        answer = high_range - low_range - 1;

        return answer;
    }
}
