public class 세균_증식 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));
    }

    public static int solution(int n, int t) {
        int answer = 0;

        for (int i = 1; i <= t; i++) {
            n *= 2;
        }

        answer = n;

        return answer;
    }
}
