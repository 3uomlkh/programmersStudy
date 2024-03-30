package lv_1;

import java.util.*;

public class 대충_만든_자판 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                // Math.min()을 이용해 더 작은 인덱스(눌러야 하는 키의 최솟값) 찾기
                map.put(c, Math.min(i + 1, map.getOrDefault(c, Integer.MAX_VALUE))); // getOrDefault() : 찾는 키가 있으면 찾는 키의 값을 반환, 없으면 기본 값을 반환하는 메서드
            }
        }

        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                char t = targets[i].charAt(j);
                if (map.containsKey(t)) { // 키에 타겟이 포함되어 있으면
                    answer[i] += map.get(t); // answer에 키에 해당하는 값 더하기
                } else { // 키에 타겟이 포함되어 있지 않으면 -> 목표 문자열을 작성할 수 없으므로 -1 반환
                    answer[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }
}
