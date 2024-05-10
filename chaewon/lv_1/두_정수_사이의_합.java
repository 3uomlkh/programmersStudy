package lv_1;

public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a == b) return a;

        int start = (a < b) ? a : b; // Math.min() 사용하면 더 간결.
        int end = (a > b) ? a : b; // Math.max() 사용하면 더 간결.

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }
}
