public class 양꼬치 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    public static int solution(int n, int k) {
        int answer = 0;
        int freeDrink = 0;

        freeDrink = n / 10;

        answer = n * 12000 + (k - freeDrink) * 2000;

        return answer;
    }
}
