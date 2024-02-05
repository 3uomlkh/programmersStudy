package lv_0;

public class my_string {
    public static void main(String[] args) {
        System.out.println(solution("masterpiece"));
        System.out.println(solution("programmers"));
        System.out.println(solution("jerry"));
        System.out.println(solution("burn"));
    }

    public static String solution(String rny_string) {
        return rny_string.replace("m", "rn");
    }
}
