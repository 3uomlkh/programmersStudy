package lv_0;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();

        sb.append(my_string.substring(s, e + 1));
        sb.reverse();
        return my_string.substring(0, s) + sb + my_string.substring(e + 1);
    }
}
