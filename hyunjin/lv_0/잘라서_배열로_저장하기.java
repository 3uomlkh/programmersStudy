import java.util.Arrays;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution("abcdef123", 3)));
    }

    public static String[] solution(String my_str, int n) {
        int num = 0;
        if (my_str.length() % n == 0) {
            num = my_str.length() / n;
        } else {
            num = (my_str.length() / n) + 1;
        }

        String[] answer = new String[num];

        for (int i = 0; i < num; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
