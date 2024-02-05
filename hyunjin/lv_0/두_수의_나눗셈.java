public class 두_수의_나눗셈 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }

    public static int solution(int num1, int num2) {
        int answer = 0;

        double result = (double) num1 / num2 * 1000;

        return (int) result;
    }
}
