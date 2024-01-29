package lv_0;

import java.util.ArrayList;

public class 배열_만들기_5 {
    public static void main(String[] args) {
        String[] intStrs = {"0123456789","9876543210","9999999999999"};
        System.out.println(solution(intStrs, 50000, 5, 5));
    }

    public static ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (String intStr : intStrs) {
            int a = Integer.parseInt(intStr.substring(s, s + l));
            if (a > k) answer.add(a);
        }

        return answer;
    }
}
