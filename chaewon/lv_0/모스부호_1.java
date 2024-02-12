package lv_0;

import java.util.HashMap;
import java.util.Map;

public class 모스부호_1 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution(String letter) {
        StringBuilder answer = new StringBuilder();

        HashMap<String,String> map = new HashMap<>(){{
            put(".-","a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".","e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put(".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");
        }};

        String[] letters = letter.split(" ");

        for (String s : letters) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equals(s)) {
                    answer.append(entry.getValue());
                }
            }
        }
        return answer.toString();
    }
}
