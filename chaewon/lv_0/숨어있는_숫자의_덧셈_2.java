package lv_0;

public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String str = "";

        for (int i = 0 ; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (Character.isDigit(c)) {
                str += c;
            } else {
                if (!str.isEmpty()) {
                    answer += Integer.parseInt(str);
                    str = "";
                }
            }
        }

        return answer;
    }
}
