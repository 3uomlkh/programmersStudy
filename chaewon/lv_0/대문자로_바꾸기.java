package lv_0;

public class 대문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("AAA"));
    }

    public static String solution(String myString) {
        return myString.toUpperCase();
    }
}
