package lv_2;

import java.util.*;

public class 귤_고르기 {
    public int solution(int k, int[] tangerine) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        Integer[] count = new Integer[map.size()];
        int idx = 0;
        for (Integer i : map.keySet()) {
            count[idx++] = map.get(i);
        }

        Arrays.sort(count, Collections.reverseOrder());

        int sum = 0;
        int result = 0;
        for (Integer i : count) {
            sum += i;
            result++;
            if (sum >= k) break;
        }

        return result;
    }
}
