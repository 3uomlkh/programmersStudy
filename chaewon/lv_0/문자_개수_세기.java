package lv_0;

import java.util.Arrays;

public class 문자_개수_세기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }

    // 잘 안풀린 문제 - 아스키 코드 활용하는 법 알아두기
    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) > 64 && my_string.charAt(i) < 91) {
                answer[my_string.charAt(i) - 65]++;
            } else if (my_string.charAt(i) > 96 && my_string.charAt(i) < 123) {
                answer[my_string.charAt(i) - 97 + 26]++;
            }
        }

        return answer;
    }
}
