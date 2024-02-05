package lv_0;

import java.util.Arrays;

public class 다섯명씩 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }

    public static String[] solution(String[] names) {
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length % 5];
        int index = 0;
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[index] = names[i];
                index++;
            }
        }

        return answer;
    }
}
