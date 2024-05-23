package lv_2;

public class 멀리_뛰기 {
    static long[] answer;
    static int k = 1234567;

    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(3));
    }

    /* DP를 이용한 피보나치 수열 구현을 검색한 후 푼 문제 - 다시 풀기
    * DP(Dynamic Programing) : 복잡한 문제를 여러 개의 하위 문제로 나누어 풀고, 그것을 결합해 최종 문제 해결
    * 메모이제이션(Memoization) : 반복되어 계산되는 부분을 기억해놨다가 다음에 사용할 때 다시 계산하지 않고 그 값을 불러오는 것
    */
    public static long solution(int n) {
        answer = new long[2001];
        return dp(n) % k;
    }

    public static long dp(int n) {
        if (answer[n] != 0) {
            return answer[n];
        }
        if (n < 3) {
            answer[n] = n;
        } else {
            answer[n] = dp(n - 1) % k + dp(n - 2) % k;
        }
        return answer[n];
    }
}
