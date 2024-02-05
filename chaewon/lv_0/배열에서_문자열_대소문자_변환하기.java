package lv_0;

import java.util.Arrays;

public class 배열에서_문자열_대소문자_변환하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"AAA", "BBB", "CCC", "DDD"})));
        System.out.println(Arrays.toString(solution(new String[]{"aBc","AbC"})));
    }

    public static String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            if (i % 2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            } else {
                answer[i] = strArr[i].toUpperCase();
            }
        }

        return answer;
    }
}
