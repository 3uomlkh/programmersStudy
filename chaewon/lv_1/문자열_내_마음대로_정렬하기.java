package lv_1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
    }
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String a, String b) {
                String o1 = Character.toString(a.charAt(n));
                String o2 = Character.toString(b.charAt(n));
                return (o1).compareTo(o2);
            }
        });

        return strings;
    }
}
