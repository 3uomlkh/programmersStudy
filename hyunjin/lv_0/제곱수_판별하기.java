public class 제곱수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }

    public static int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (n / i == i && n % i == 0) {
                count++;
            }
        }

        if (count > 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
