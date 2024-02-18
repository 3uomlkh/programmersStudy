package lv_0;

public class 제곱수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        int answer = 2;

        for (int i = 1; i < n; i++) {
            if ((i*i) == n) {
                answer = 1;
                break;
            }
        }

        return answer;
    }
}
