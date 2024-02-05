public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(10));
        System.out.println(solution(4));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= 6 * n; i++) {
            if (6 * i % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}
