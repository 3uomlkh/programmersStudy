public class 이진수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }

    public static String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = 0;
        int num2 = 0;

        num1 = Integer.parseInt(bin1, 2);
        num2 = Integer.parseInt(bin2, 2);

        answer = Integer.toBinaryString(num1 + num2);

        return answer;
    }
}
