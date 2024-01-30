package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class ad_제거하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"and", "notad", "abcd"})));
        System.out.println(Arrays.toString(solution(new String[]{"there","are","no","a","ds"})));
    }

    public static String[] solution(String[] strArr) {

        ArrayList<String> strs = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) strs.add(s);
        }

        return strs.toArray(new String[0]);
    }
}
