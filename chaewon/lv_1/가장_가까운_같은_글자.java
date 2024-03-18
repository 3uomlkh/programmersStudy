package lv_1;

import java.util.Arrays;

public class 가장_가까운_같은_글자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
        System.out.println(Arrays.toString(solution("foobar")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        answer[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[i] == arr[j]) {
                    answer[i] = i - j;
                    break;
                } else answer[i] = -1;
            }
        }
        return answer;
    }
}
