public class 대문자와_소문자 {
    public static void main(String[] args) {
        System.out.println(solution("cccCCC"));
        System.out.println(solution("abCdEfghIJ"));
    }

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if ((int) my_string.charAt(i) > 64 && (int) my_string.charAt(i) < 91) {
                answer += (char) (my_string.charAt(i) + 32);
            } else {
                answer += (char) (my_string.charAt(i) - 32);
            }
        }

        return answer;
    }
}
