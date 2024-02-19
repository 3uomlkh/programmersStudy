package lv_0;

import java.util.Arrays;

public class 잘라서_배열로_저장하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
    }

    public static String[] solution(String my_str, int n) {
        int size;
        if (my_str.length() % n == 0) {
            size = my_str.length() / n;
        } else {
            size = (my_str.length() / n) + 1;
        }

        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            int start = n * i;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
