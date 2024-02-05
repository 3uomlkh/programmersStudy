package lv_0;

import java.util.Arrays;

public class 분수의_덧셈 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 2, 3, 4)));
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom;
        int numer;

        denom = denom1 * denom2;

        numer1 *= denom2;
        numer2 *= denom1;

        numer = numer1 + numer2;

        int number;

        if (denom < numer) {
            number = denom;
        } else {
            number = numer;
        }

        for (int i = 2; i <= number; i++) {

            if (denom % i == 0 && numer % i == 0) {
                denom /= i;
                numer /= i;
            }

            if (denom % numer == 0) {
                denom /= numer;
                numer /= numer;
            } else if (numer % denom == 0) {
                numer /= denom;
                denom /= denom;
            }
        }

        return new int[]{numer, denom};
    }
}
