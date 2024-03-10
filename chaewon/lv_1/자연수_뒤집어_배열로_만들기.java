package lv_1;

import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        // StringBuilder의 reverse()를 사용하면 문자열을 바로 뒤집을 수 있다!
//        StringBuilder sb = new StringBuilder(String.valueOf(n));
//        sb = sb.reverse();
//        String[] answer = sb.toString().split("");

        String str = n + "";
        int[] answer = new int[str.length()];

        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            answer[index++] = Character.getNumericValue(str.charAt(i));
        }

        return answer;
    }
}
