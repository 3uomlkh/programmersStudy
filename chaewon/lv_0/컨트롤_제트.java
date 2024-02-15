package lv_0;

import java.util.Arrays;

import static java.lang.Character.isDigit;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        System.out.println(solution("-1 -2 -3 Z"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] strs = s.split(" ");

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals("Z")) {
                strs[i-1] = "0";
            }
        }

        for (String str : strs) {
            if (str.chars().allMatch(Character::isDigit)) {
                System.out.println(str);
                answer += Integer.parseInt(str);
            }
        }

        return answer;
    }

}
