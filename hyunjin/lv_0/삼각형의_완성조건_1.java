import java.util.Arrays;

public class 삼각형의_완성조건_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3}));
        System.out.println(solution(new int[]{3, 6, 2}));
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    public static int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);

        if (sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
