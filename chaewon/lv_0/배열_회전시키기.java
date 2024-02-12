package lv_0;

import java.util.*;

public class 배열_회전시키기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));
    }

    // Deque 사용하지않고 그냥 배열로 풀 수 있음
    public static int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = numbers.length - 1; i >= 0; i--) deque.push(numbers[i]);

        int last = numbers[numbers.length - 1];
        int first = numbers[0];

        switch (direction) {
            case "right" :
                deque.pollLast();
                deque.offerFirst(last);
                break;
            case "left" :
                deque.pollFirst();
                deque.offerLast(first);
        }

        int index = 0;
        int[] answer = new int[numbers.length];
        for (Integer integer : deque) answer[index++] = integer;

        return answer;
    }
}
