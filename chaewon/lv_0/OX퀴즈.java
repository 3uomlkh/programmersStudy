package lv_0;

import java.util.Arrays;

public class OX퀴즈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 - 4 = -3", "5 + 6 = 11"})));
    }

    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] numbers = quiz[i].split(" ");
            for (int j = 0; j < numbers.length; j++) {
                int result = numbers[1].equals("+") ? Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2])
                        : Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[2]);
                if (result == Integer.parseInt(numbers[4])) answer[i] = "O";
                else answer[i]= "X";
            }
        }

        return answer;
    }
}
