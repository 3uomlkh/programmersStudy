package lv_1;

import java.util.Arrays;
import java.util.HashMap;

public class 추억_점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution(name, yearning, photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        HashMap<String, Integer> map = new HashMap<>(name.length);

        // 이름과 추억 점수를 HashMap에 저장
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int count = 0;
            for (int j = 0; j < photo[i].length; j++) {
                // 해당하는 이름이 있으면 그 이름의 추억 점수를 count에 더하기
                if (map.containsKey(photo[i][j])) {
                    count += map.get(photo[i][j]);
                }
            }
            // 하나의 사진이 끝나면 최종 count 배열에 추가
            answer[i] = count;
        }

        return answer;
    }
}
