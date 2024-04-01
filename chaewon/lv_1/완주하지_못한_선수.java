package lv_1;

import java.util.HashMap;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }

    // 헷갈린 문제 - 다시 풀어보기
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>(participant.length);
        for (String key : participant) {
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                continue;
            }
            map.put(key, 1);
        }

        for (int i = 0; i < completion.length; i++) {
            if (map.containsKey(completion[i])) {
                if (map.get(completion[i]) == 1) map.remove(completion[i]); // 완주한 선수가 1명이면 제거
                else map.replace(completion[i], map.get(completion[i]) - 1); // 완주한 선수가 1명이 아니면 하나씩 빼기
            }
        }

        // 마지막에는 완주한 선수 목록에 없는 선수 혹은 완주한 선수 목록에 있어도 완주하지 못한 동명이인이 있는 경우의 키만 남음.
        for (String key : map.keySet()) {
            answer = key;
        }

        return answer;
    }
}
