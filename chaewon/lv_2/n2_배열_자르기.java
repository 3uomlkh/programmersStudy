package lv_2;

import java.util.*;

public class n2_배열_자르기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 2, 5)));
    }

    public static int[] solution(int n, long left, long right) {
        List<Integer> ansList = new ArrayList<>();

        for (long i = left; i <= right; i++) {
            if (i / n <= i % n)
                ansList.add((int) (i % n) + 1);
            else
                ansList.add((int) (i / n) + 1);
        }

        int[] answer = new int[ansList.size()];

        for (int i = 0; i < answer.length; i++)
            answer[i] = ansList.get(i);

        return answer;
    }
}
