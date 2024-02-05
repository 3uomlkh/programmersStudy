package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 세_개의_구분자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("baconlettucetomato")));
        System.out.println(Arrays.toString(solution("abcd")));
        System.out.println(Arrays.toString(solution("cabab")));
    }

    public static String[] solution(String myStr) {
        myStr = myStr.replaceAll("[abc]", " ");
        ArrayList<String> strs = new ArrayList<>(Arrays.asList(myStr.split(" ")));
        strs.removeAll(Arrays.asList("", " ", null));
        if (strs.isEmpty()) return new String[] {"EMPTY"};
        return strs.toArray(new String[0]);
    }
}
