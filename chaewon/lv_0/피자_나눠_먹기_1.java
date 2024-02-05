package lv_0;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {
        System.out.println(solution(7));
        System.out.println(solution(1));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        return (n % 7 == 0) ? n / 7 : (n / 7) + 1;
    }
}
