package lv_0;

public class 원하는_문자열_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa"));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        if (myString.toUpperCase().contains(pat.toUpperCase())) return 1;
        return answer;
    }
}
