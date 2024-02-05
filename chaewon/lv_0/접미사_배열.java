package lv_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 접미사_배열 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("programmers")));
    }

    public static String[] solution(String my_string) {
        ArrayList<String> answer_list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) answer_list.add(my_string.substring(i));
        Collections.sort(answer_list);

        return answer_list.toArray(new String[answer_list.size()]);
    }

    // ArrayList를 쓰지 않고 배열로 푼 방법(다른 사람 답안)
    public static String[] solution2(String my_string) {
        String[] answer = new String[my_string.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
