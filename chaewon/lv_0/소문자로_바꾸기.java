package lv_0;

public class 소문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }
}
