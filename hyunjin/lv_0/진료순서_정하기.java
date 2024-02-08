import java.util.Arrays;

public class 진료순서_정하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        Arrays.fill(answer, 1);

        for (int i = 0; i < emergency.length; i++) {
            for (int j : emergency) {
                if (emergency[i] < j) {
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}
