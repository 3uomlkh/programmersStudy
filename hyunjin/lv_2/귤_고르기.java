import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 귤_고르기 {
    public static void main (String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int sum = 0;
        int cnt = 0;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        for (int v : valueList) {
            if (sum + v >= k) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }
        return cnt;
    }
}
