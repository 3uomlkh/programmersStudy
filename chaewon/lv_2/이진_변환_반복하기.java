package lv_2;

import java.util.Arrays;

public class 이진_변환_반복하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        int length;
        int preLeng = s.length();

        while (!s.equals("1")) {
            s = s.replace("0", "");
            length = s.length();
            answer[1] += preLeng - length;
            s = stringTobinary(length);
            preLeng = s.length();
            answer[0]++;
        }

        return answer;
    }

    // 이진 변환하는 함수 -> Integer.toBinaryString() 이라는 함수가 있었다!
    public static String stringTobinary(int num) {
        StringBuilder result = new StringBuilder();

        while (num > 0) {
            result.append(num % 2);
            num = num / 2;
        }

        return result.reverse().toString();
    }
}
