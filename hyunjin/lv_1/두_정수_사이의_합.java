public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        System.out.println(solution(3, 5));
        System.out.println(solution(3, 3));
        System.out.println(solution(5, 3));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        for (long i = min; i <= max; i++) {
            answer += i;
        }

        return answer;
    }
}
