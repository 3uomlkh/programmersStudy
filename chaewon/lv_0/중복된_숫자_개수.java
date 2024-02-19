package lv_0;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 2, 3, 4, 5}, 1));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;

        for (int i : array) {
            if (i == n) answer++;
        }

        return answer;
    }
}
