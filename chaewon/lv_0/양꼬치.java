package lv_0;

public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int service = (n / 10) * 2000;
        int lamb = n * 12000;
        int drink = k * 2000;

        return lamb + drink - service;
    }
}
