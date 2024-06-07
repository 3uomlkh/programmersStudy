package lv_2;

import java.util.*;

public class 튜플 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
        System.out.println(Arrays.toString(solution("{{20,111},{111}}")));
    }

    public static int[] solution(String s) {
        int[] answer = {};
        s = s.substring(2, s.length() - 2).replace("},{", "-");
        String[] arr = s.split("-");

        Arrays.sort(arr, Comparator.comparingInt(String::length));

        List<Integer> list = new ArrayList<>();
        for (String str : arr) {
            String[] check = str.split(",");

            for (int i = 0; i < check.length; i++) {
                int num = Integer.parseInt(check[i]);
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}
