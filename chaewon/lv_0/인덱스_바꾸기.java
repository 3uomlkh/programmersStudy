package lv_0;

public class 인덱스_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("hello", 1, 2));
        System.out.println(solution("I love you", 3, 6));
    }

    public static String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);

        char c = my_string.charAt(num1);
        sb.setCharAt(num1, my_string.charAt(num2)); // StringBuilder의 setCharAt을 사용해 내용을 바꾸면 replace()보다 더 빠른 속도를 바꿀 수 있다.
        sb.setCharAt(num2, c);

        return sb.toString();
    }
}
