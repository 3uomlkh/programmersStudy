package lv_0;

import java.util.Arrays;

public class 문자열_정렬하기_2 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
    }

    public static String solution(String my_string) {
        String[] strList = my_string.toLowerCase().split("");
        Arrays.sort(strList);

        StringBuilder answer = new StringBuilder();
        for (String str : strList) answer.append(str);

        return answer.toString();
    }
}
