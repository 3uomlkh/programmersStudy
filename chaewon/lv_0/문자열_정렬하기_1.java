package lv_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열_정렬하기_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("hi12392")));
        System.out.println(Arrays.toString(solution("p2o4i8gj2")));
        System.out.println(Arrays.toString(solution("abcde0")));
    }

    public static int[] solution(String my_string) {
        ArrayList<Integer> list = new ArrayList<>();

        for (char c : my_string.toCharArray()) {
            if (Character.isDigit(c)) // isDigit() - char값이 숫자인지 확인
                list.add(Character.getNumericValue(c)); // 숫자로 변환해 리스트에 추가
        }

        Collections.sort(list); // 리스트 오름차순 정렬

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
