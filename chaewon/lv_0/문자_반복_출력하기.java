package lv_0;

public class 문자_반복_출력하기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 3));
    }

    public static String solution(String my_string, int n) {
        String answer;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            answer = String.valueOf(my_string.charAt(i));
            sb.append(answer.repeat(n));
        }

        return sb.toString();
    }
}
