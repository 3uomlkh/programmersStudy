import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> hm = new HashMap<>();

        for (String p : participant) {
            hm.put(p, hm.getOrDefault(p, 0)+1);
        }

        for (String c : completion) {
            hm.put(c, hm.get(c) - 1);
        }

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0) {
                answer = key;
                break;
            }
        }

        return answer;

    }
}
