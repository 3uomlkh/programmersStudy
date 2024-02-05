package lv_0;

import java.util.ArrayList;

public class 콜라츠_수열_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
                numbers.add(n);
            } else {
                n = 3 * n + 1;
                numbers.add(n);
            }
        }

        return numbers;
    }
}
