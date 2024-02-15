import java.util.Arrays;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
        String str = "";

        str = my_string.replaceAll("[^0-9]", "");

        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        Arrays.sort(answer);

        return answer;
    }
}
