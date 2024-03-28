package lv_1;

import java.util.HashMap;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 1, 2, 3}));
    }

    public static int solution(int[] nums) {
        int answer;
        // HashMap 대신 HashSet을 사용하면 중복을 없애주므로 더 간결한 코드 가능.
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                continue;
            }
            map.put(num, 1);
        }

        answer = map.size();
        while (answer > nums.length / 2) {
            answer--;
        }

        return answer;
    }
}
