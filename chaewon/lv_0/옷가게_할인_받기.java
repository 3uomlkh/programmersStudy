package lv_0;

public class 옷가게_할인_받기 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
        System.out.println(solution(580000));
    }

    public static int solution(int price) {
        double discount = 0.0;

        if (price >= 500000) {
            discount = price * 0.2;
        } else if (price >= 300000) {
            discount = price * 0.1;
        } else if (price >= 100000) {
            discount = price * 0.05;
        }

        return (int) Math.floor(price - discount);
    }
}
