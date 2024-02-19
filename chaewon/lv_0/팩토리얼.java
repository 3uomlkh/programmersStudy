package lv_0;

public class 팩토리얼 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
    }

    public static int solution(int n) {
        int answer = 1;

        for (int i = 1; i <= n; i++) {
            answer *= i;
            if (answer > n) { // i!가 n보다 크다면
                answer = i - 1; // i - 1이 n이하의 최대 팩토리얼
                break;
            }
        }
        return answer;
    }
}
