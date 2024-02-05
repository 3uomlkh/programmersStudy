package lv_0;

import java.util.Objects;

public class 간단한_식_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("43 + 12"));
        System.out.println(solution("0 - 7777"));
        System.out.println(solution("40000 * 40000"));
    }

    public static int solution(String binomial) {
        int answer;
        String[] strs = binomial.split(" ", 3);
        if (Objects.equals(strs[1], "+")) {
            answer = Integer.parseInt(strs[0]) + Integer.parseInt(strs[2]);
        } else if (Objects.equals(strs[1], "-")) {
            answer = Integer.parseInt(strs[0]) - Integer.parseInt(strs[2]);
        } else {
            answer = Integer.parseInt(strs[0]) * Integer.parseInt(strs[2]);
        }
        return answer;
    }
}
