import java.util.Arrays;
import java.util.Objects;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3"));
        System.out.println(solution("10 20 30 40"));
        System.out.println(solution("10 Z 20 Z 1"));
        System.out.println(solution("10 Z 20 Z"));
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Z")) {
                answer -= Integer.parseInt(arr[i - 1]);
            } else {
                answer += Integer.parseInt(arr[i]);
            }
        }

        return answer;
    }
}
