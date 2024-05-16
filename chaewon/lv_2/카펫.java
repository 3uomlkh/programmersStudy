package lv_2;

import java.util.*;

public class 카펫 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10, 2)));
        System.out.println(Arrays.toString(solution(8, 1)));
        System.out.println(Arrays.toString(solution(24, 24)));
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sizeOfCarpet = brown + yellow;
        ArrayList<Integer> yellowNum = new ArrayList<>();

        for (int i = 1; i <= yellow; i++) {
            if (yellow % i == 0) yellowNum.add(i + 2);
        }

        int idx = 0;
        if (yellowNum.size() > 2) {
            for (int i = yellowNum.size() - 1; i >= yellowNum.size() / 2; i--) {
                if (yellowNum.get(idx) * yellowNum.get(i) == sizeOfCarpet) {
                    answer[0] = yellowNum.get(i);
                    answer[1] = yellowNum.get(idx);
                    break;
                }
                idx++;
            }
        } else if (yellowNum.size() == 1) {
            answer[0] = yellowNum.get(0);
            answer[1] = yellowNum.get(0);
        } else {
            Collections.sort(yellowNum, Collections.reverseOrder());
            for (int i = 0; i < answer.length; i++) {
                answer[i] = yellowNum.get(i);
            }
        }

        return answer;
    }
}
