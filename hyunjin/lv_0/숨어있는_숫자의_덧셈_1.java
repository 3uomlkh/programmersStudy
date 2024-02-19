public class 숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String str = "";

        str = my_string.replaceAll("[a-zA-Z]", "");

        for (int i = 0; i < str.length(); i++) {
            answer += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        return answer;
    }
}
