package lv_0;

public class 대문자와_소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i))) {
                answer.append(Character.toLowerCase(my_string.charAt(i)));
            } else {
                answer.append(Character.toUpperCase(my_string.charAt(i)));
            }
        }

        return answer.toString();
    }
}
