package lv_0;

public class 입문_문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString();
    }
}
