package lv_0;

import java.util.ArrayList;

public class 세로_읽기 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
    }

    public static String solution(String my_string, int m, int c) {
        String answer = "";
        ArrayList<String> my_strings = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i+=m) {
            String s = my_string.substring(i, i+m);
            my_strings.add(s);
        }

        for (String myString : my_strings) {
            answer += myString.charAt(c - 1);
        }

        /* 다른 답안을 보니 아래 방법으로 ArrayList를 만들지 않아도 구현할 수 있었다.(패턴 잘 분석하기)
        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
         */

        return answer;
    }
}
