package lv_1;

import java.util.*;

public class 햄버거_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }

    // Stack과 StringBuilder로 구현해보려다가 실패 -> 답을 보고 푼 문제
    public static int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : ingredient) {
            stack.push(i);
            if (stack.size() >= 4) {
                int size = stack.size();
                if (stack.get(size - 1) == 1
                        && stack.get(size - 2) == 3
                        && stack.get(size - 3) == 2
                        && stack.get(size - 4) == 1) {
                    answer++;
                    stack.pop();
                    stack.pop();
                    stack.pop();
                    stack.pop();
                }
            }
        }

        return answer;
    }
}
