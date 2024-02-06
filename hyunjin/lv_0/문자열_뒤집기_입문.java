public class 문자열_뒤집기_입문 {
    public static void main(String[] args) {
        System.out.println(solution("jaron"));
        System.out.println(solution("bread"));
    }

    public static String solution(String my_string) {
        String answer = "";

        for (int i = my_string.length(); i > 0; i--) {
            answer += my_string.charAt(i-1);
        }

        return answer;
    }
}
