package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 공백으로_구분하기_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(" i    love  you")));
        System.out.println(Arrays.toString(solution("    programmers  ")));
    }

    public static String[] solution(String my_string) {

        ArrayList<String> strs = new ArrayList<>(Arrays.asList(my_string.split(" ")));
        strs.removeAll(Arrays.asList("", " ", null));
        String[] answer = strs.toArray(new String[strs.size()]);

        return answer;
    }
}
