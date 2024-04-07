import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution(new int[]{0, 0, 0, 0, 0, 0}, new int[]{38, 19, 20, 40, 15, 25})));
        System.out.println(Arrays.toString(solution(new int[]{45, 4, 35, 20, 3, 9}, new int[]{20, 9, 3, 45, 4, 35})));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int unCount = 0;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    count++;
                }
            }
            if (lottos[i] == 0) {
                unCount++;
            }
        }

        answer[0] = count + unCount;
        answer[1] = count;

        for (int i = 0; i < 2; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                case 1, 0:
                    answer[i] = 6;
                    break;
            }
        }

        return answer;
    }
}
