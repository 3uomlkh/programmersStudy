package lv_1;

public class 짝수와_홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }
}
