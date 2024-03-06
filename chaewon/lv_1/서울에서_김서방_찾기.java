package lv_1;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");
        StringBuilder answer = new StringBuilder();
        answer.append("김서방은 ").append(index).append("에 있다");
        return answer.toString();
    }
}
