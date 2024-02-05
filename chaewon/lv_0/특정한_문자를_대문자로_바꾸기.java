package lv_0;

public class 특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("programmers", "p"));
        System.out.println(solution("lowercase", "x"));
    }

    public static String solution(String my_string, String alp) {
        return my_string.replace(alp, alp.toUpperCase());
    }
}
