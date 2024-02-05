package lv_0;

public class 주사위_게임_1 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(6, 1));
        System.out.println(solution(2, 4));
    }

    public static int solution(int a, int b) {
        int answer;

        if (a % 2 != 0 && b % 2 != 0) {
            answer = a * a + b * b;
        } else if (a % 2 != 0 || b % 2 != 0) {
            answer = 2 * (a + b);
        } else {
            answer = Math.abs(a - b);
        }
        return answer;
    }
}
