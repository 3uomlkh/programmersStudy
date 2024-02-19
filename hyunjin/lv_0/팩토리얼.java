public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }
    public static int solution(int n) {
        int answer = 0;
        int result = 1;

        for (int i = 1; i <= 10; i++) {
            result *= i;

            if (result > n) {
                answer = i - 1;
                break;
            } else {
                answer = i;
            }
        }

        return answer;
    }
}
