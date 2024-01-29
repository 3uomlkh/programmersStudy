public class qr_code {
    public static void main(String[] args) {
        System.out.println(solution(3, 1, "qjnwezgrpirldywt"));
        System.out.println(solution(3, 1, "programmers"));
    }

    public static String solution(int q, int r, String code) {
        String answer = "";

        for (int index = 0; index < code.length(); index++) {
            if (index % q == r) {
                answer += code.charAt(index);
            }
        }

        // Hint: r부터 시작해 q만큼 커진다는 사실을 알면 if문을 사용하지 않고도 구현할 수 있음!

        return answer;
    }

}
