package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class x_사이의_개수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("oxooxoxxox")));
    }

    public static int[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] strs = myString.split("x");
        System.out.println(Arrays.toString(strs));
        for (String str : strs) {
            list.add(str.length());
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        return answer;
    }
}
