public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        boolean answer = false;

        if (s.length() == 4 || s.length() == 6) {
            if (s.replaceAll("[0-9]", "").equals("")) {
                answer = true;
            }
        }

        return answer;
    }
}
