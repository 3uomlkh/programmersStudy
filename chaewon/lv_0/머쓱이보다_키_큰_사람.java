package lv_0;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {149, 180, 192, 170}, 167));
    }

    public static int solution(int[] array, int height) {
        int answer = 0;

        for (int i : array) {
            if (i > height) answer++;
        }

        return answer;
    }
}
