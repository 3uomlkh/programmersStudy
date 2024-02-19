package lv_0;

import java.util.Arrays;

public class 배열_원소의_길이 {
    public static void main(String[] args) {
        String[] strList = {"We", "are", "the", "world!"};
        System.out.println(Arrays.toString(solution(strList)));
    }

    public static int[] solution(String[] strList) {
        int[] answer = new int[strList.length];

        for (int i = 0; i < strList.length; i++) {
            answer[i] = strList[i].length();
        }
        return answer;
    }
}
