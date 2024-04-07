package lv_1;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        System.out.println(Arrays.toString(solution(lottos, win_nums)));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int max = 0;
        for (int lotto : lottos) {
            for (int num : win_nums) {
                if (lotto == num) min++;
            }
            if (lotto == 0) max++;
        }

        max += min;
        return new int[] {makeResult(max), makeResult(min)};
    }

    public static int makeResult(int num) {
        int ranking;
        switch (num) {
            case 6:
                ranking = 1;
                break;
            case 5:
                ranking = 2;
                break;
            case 4:
                ranking = 3;
                break;
            case 3:
                ranking = 4;
                break;
            case 2:
                ranking = 5;
                break;
            default:
                ranking = 6;
                break;
        }
        return ranking;
    }
}
