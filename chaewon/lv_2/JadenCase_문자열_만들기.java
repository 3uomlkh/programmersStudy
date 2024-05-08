package lv_2;

public class JadenCase_문자열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("3people unFollowed me"));
        // 앞, 뒤에 공백이 나오거나 공백이 연속해서 나올 수 있다는 조건을 잘보자.
        System.out.println(solution(" for the what 1what "));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i - 1) == ' ') {
                answer.append(Character.toUpperCase(s.charAt(i)));
                continue;
            }
            answer.append(Character.toLowerCase(s.charAt(i)));
        }

        return answer.toString();
    }
}
