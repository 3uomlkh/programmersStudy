public class 인덱스_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("i love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);

        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);

        sb.setCharAt(num1, b);
        sb.setCharAt(num2, a);

        answer = sb.toString();

        return answer;
    }
}
