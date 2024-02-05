package lv_0;

import java.util.ArrayList;
import java.util.List;

public class 커피_심부름 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anything"}));
    }

    public static int solution(String[] order) {
        int answer = 0;
        ArrayList<String> americanos = new ArrayList<>(List.of("iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything"));
        ArrayList<String> cafelattes = new ArrayList<>(List.of("icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte"));

        for (String s : order) {
            if (americanos.contains(s)) {
                answer += 4500;
            } else if (cafelattes.contains(s)) {
                answer += 5000;
            }
        }
        return answer;
    }
}
