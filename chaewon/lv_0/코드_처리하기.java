public class 코드_처리하기 {
    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }

    public static String solution(String code) {
        String answer = "";
        char[] c = code.toCharArray();
        int mode = 0;

        for (int i = 0; i < c.length; i++) {
            if (mode == 0) {
                if (c[i] != '1' && i % 2 == 0) {
                    answer += c[i];
                } else if (c[i] == '1') {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (c[i] != '1' && i % 2 != 0) {
                    answer += c[i];
                } else if (c[i] == '1') {
                    mode = 0;
                }
            }
        }

        if (answer.isEmpty()) return "EMPTY";

        return answer;
    }
}
