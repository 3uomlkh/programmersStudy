public class 짝수와_홀수 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int num) {
        String answer = "";

        if (num % 2 == 0 || num == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }

        return answer;
    }
}
