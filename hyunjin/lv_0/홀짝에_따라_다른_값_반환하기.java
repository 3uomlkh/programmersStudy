public class 홀짝에_따라_다른_값_반환하기 {
    public int solution(int n) {
        int answer = 0;

        if (n % 2 == 0) {
            for (int i = 0; i <= n; i += 2) {
                answer += i * i;
            }
        } else {
            for (int j = 1; j <= n; j += 2) {
                answer += j;
            }
        }
        return answer;
    }
}
