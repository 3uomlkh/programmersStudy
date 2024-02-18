package lv_0;

public class 세균_증식 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10));
    }

    public static int solution(int n, int t) {
        int answer = n;

        for (int i = 1; i <= t; i++) {
            answer *= 2;
        }

        return answer;
    }
}
