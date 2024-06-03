package lv_2;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        System.out.println(solution(want, number, discount));
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();

        for (int i = 0; i < want.length; i++)
            wantMap.put(want[i], number[i]);

        for (int j = 0; j < discount.length - 9; j++) {
            int idx = 0;
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < 10; i++)
                map.put(discount[i + j], map.getOrDefault(discount[i + j], 0) + 1);

            for (Map.Entry<String, Integer> entry : wantMap.entrySet())
                if (map.containsKey(entry.getKey()) && entry.getValue() <= map.get(entry.getKey()))
                    idx++;

            if (idx == want.length)
                answer++;
        }

        return answer;
    }
}
