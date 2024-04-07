package lv_1;

import java.util.HashMap;

public class 숫자_짝꿍 {
    public static void main(String[] args) {
        System.out.println(solution("100", "2345"));
        System.out.println(solution("5525", "1255"));
    }

    public static String solution(String X, String Y) {
        HashMap<Character, Integer> mapX = new HashMap<>();
        for (char c : X.toCharArray()) { // X를 각 숫자별로 몇 개 인지 세어 저장
            if (mapX.containsKey(c)) {
                mapX.put(c, mapX.get(c) + 1);
                continue;
            }
            mapX.put(c, 1);
        }

        HashMap<Character, Integer> mapY = new HashMap<>();
        for (char c : Y.toCharArray()) { // Y를 각 숫자별로 몇 개 인지 세어 저장
            if (mapY.containsKey(c)) {
                mapY.put(c, mapY.get(c) + 1);
                continue;
            }
            mapY.put(c, 1);
        }

        StringBuilder sb = new StringBuilder();
        for (Character c1 : mapX.keySet()) {
            for (Character c2 : mapY.keySet()) {
                if (c1 == c2) { // mapX와 mapY의 key가 같으면
                    int num = Math.min(mapX.get(c1), mapY.get(c2)); // 해당 키의 가장 작은 value를 num에 넣기
                    sb.append(c1.toString().repeat(num)); // num만큼 반복하여 StringBuilder에 저장
                }
            }
        }

        sb.reverse(); // 가장 큰 수를 만들어야 하므로 역순으로 정렬
        if (sb.toString().isEmpty()) return "-1";
        if (sb.toString().charAt(0) == '0') return "0";

        return sb.toString();
    }
}
