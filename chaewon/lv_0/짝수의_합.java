package lv_0;

public class 짝수의_합 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = n; i > 0; i--) { // i가 2부터 시작해 2씩 커지도록 만든다면 if문이 없어도 될 것.
            if (i % 2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
