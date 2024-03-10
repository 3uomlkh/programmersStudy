package lv_1;

public class 콜라츠_추측 {
    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution(626331));
    }

    public static int solution(int num) {
        int answer = 0;
        long n = num; // overflow 문제로 num을 복사해 long 타입으로

        while (n != 1) {
            answer++;
            if (n % 2 == 0) n /= 2;
            else n = (n * 3) + 1;
            if (answer >= 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}
