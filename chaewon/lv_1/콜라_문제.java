package lv_1;

public class 콜라_문제 {
    public static void main(String[] args) {
        System.out.println(solution(3, 1, 20));
    }

    public static int solution(int a, int b, int n) {
        int answer = 0;
        int receivedColaCount;
        int martDeliveredColaCount;

        while (n >= a) {
            receivedColaCount = (n / a) * b;
            martDeliveredColaCount = a * (n / a);
            n = n - martDeliveredColaCount + receivedColaCount;
            answer += receivedColaCount;
        }

        return answer;
    }
}
