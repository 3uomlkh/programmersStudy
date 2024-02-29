import java.util.Arrays;

public class A로_B_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        int answer = 0;

        char[] be = before.toCharArray();
        char[] af = after.toCharArray();

        Arrays.sort(be);
        Arrays.sort(af);

        if (Arrays.equals(be, af)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
