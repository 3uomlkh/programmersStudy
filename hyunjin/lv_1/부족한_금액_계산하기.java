public class 부족한_금액_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long answer = -1;
        long hap = 0;

        for (int i = 1; i <= count; i++) {
            hap += price * i;
        }

        if (hap > money) {
            answer = hap - money;
        } else {
            answer = 0;
        }

        return answer;
    }
}
