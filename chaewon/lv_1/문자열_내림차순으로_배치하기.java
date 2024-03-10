package lv_1;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] strArr = s.split("");

        // Collections.reverseOrder()는 Comparator 객체를 반환한다.
        Arrays.sort(strArr, Collections.reverseOrder()); // 내림차순 정렬

        for (String str : strArr) {
            answer.append(str);
        }

        return answer.toString();
    }
}
