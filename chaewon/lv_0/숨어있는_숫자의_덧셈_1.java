package lv_0;

public class 숨어있는_숫자의_덧셈_1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) answer += Character.getNumericValue(c);
        }
        return answer;
    }

}
