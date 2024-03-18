package lv_1;

public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        System.out.println(solution("a234"));
        System.out.println(solution("1234"));
    }

    public static boolean solution(String s) {
        boolean answer = true;

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }

        // 처음에 &&를 ||로 해놓고 왜 안되지 했었는데, 연산 결과가 true인지 false인지를 잘 생각하면서 풀어야겠다.
        if (s.length() != 4 && s.length() != 6) return false;

        return answer;
    }

}
