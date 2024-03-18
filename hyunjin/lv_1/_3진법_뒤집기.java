import java.util.Arrays;
import java.util.Stack;

public class _3진법_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        int answer = 0;
        Stack<Integer> stack = new Stack<Integer>();

        int count = 0;

        while (n > 0) {
            count++;
            stack.add(n % 3);
            n = n / 3;
        }

        for (int i = 0; i < count; i++) {
            answer += stack.pop() * (Math.pow(3, i));
        }

        return answer;
    }
}
