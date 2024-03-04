package lv_0;

public class 치킨_쿠폰 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int survice;

        while (coupon > 9) {
            survice = coupon / 10;
            coupon += survice % 10;
            coupon += survice;
            answer += survice;
        }

        return answer;
    }
}
