public class 중복된_문자_제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"	));
    }

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (!answer.contains(String.valueOf(my_string.charAt(i)))) {
                answer += String.valueOf(my_string.charAt(i));
            }
        }

        return answer;
    }
}
