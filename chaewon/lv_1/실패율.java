package lv_1;

import java.util.*;

public class 실패율 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
    }

    // 답안을 보고 푼 문제 - 다시 풀기
    public static int[] solution(int N, int[] stages) {
        int[] failUser = new int[N + 1];
        int[] users = new int[N + 1];

        for (int i = 0; i < stages.length; i++) {
            for (int j = 0; j < stages[i]; j++) {
                users[j]++;
            }
            failUser[stages[i] - 1]++;
        }

        Map<Integer, Double> map = new HashMap<>(); // {스테이지 : 실패율} 저장
        for (int i = 0; i < N; i++) {
            if (failUser[i] == 0 || users[i] == 0) {
                map.put(i + 1, 0.0);
            } else {
                map.put(i + 1, (double) failUser[i] / (double) users[i]);
            }
        }

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort((o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(i -> i).toArray();
    }
}
