package lv_2;

import java.util.Stack;

public class 짝지어_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa"));
        System.out.println(solution("cdcd"));
    }

    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(c);
            } else if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        if (stack.isEmpty()) answer = 1;

        return answer;
    }
}
