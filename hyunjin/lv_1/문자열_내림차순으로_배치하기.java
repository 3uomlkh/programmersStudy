import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        String answer = "";
        String[] an = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            an[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(an, Collections.reverseOrder());

        for (int i = 0; i < an.length; i++) {
            answer += an[i];
        }

        return answer;
    }
}
