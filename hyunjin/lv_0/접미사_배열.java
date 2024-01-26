import java.util.Arrays;

public class 접미사_배열 {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i, my_string.length());
        }

        Arrays.sort(answer);
        return answer;
    }
}
