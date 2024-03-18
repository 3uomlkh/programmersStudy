package lv_1;

public class 시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char result = (char) (s.charAt(i) + n);

            if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
                if (s.charAt(i) + n > 122) {
                    result = (char) (s.charAt(i) - 26 + n);
                }

            } else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                if (s.charAt(i) + n > 90) {
                    result = (char) (s.charAt(i) - 26 + n);
                }
            } else if (s.charAt(i) == ' ') {
                sb.append(' ');
                continue;
            }
            sb.append(result);

        }

        return sb.toString();
    }
}
