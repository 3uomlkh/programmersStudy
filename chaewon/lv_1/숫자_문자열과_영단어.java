package lv_1;

import java.util.HashMap;
import java.util.Map;

public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("2three45sixseven"));
    }

    public static int solution(String s) {
        HashMap<String, String> map = new HashMap<>(10);
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            s = s.replace(entry.getKey(), entry.getValue());
        }

        return Integer.parseInt(s);
    }
}
