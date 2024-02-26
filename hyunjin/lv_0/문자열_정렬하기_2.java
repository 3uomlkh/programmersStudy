import java.util.Arrays;

public class 문자열_정렬하기_2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }
    public static String solution(String my_string) {
        String answer = "";

        answer = my_string.toLowerCase();

        char[] str = answer.toCharArray();
        Arrays.sort(str);

        return String.valueOf(str);
    }
}
