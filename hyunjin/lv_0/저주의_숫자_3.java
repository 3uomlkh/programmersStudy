public class 저주의_숫자_3 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }

        return answer;
    }
}
