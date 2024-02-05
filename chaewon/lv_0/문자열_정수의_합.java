package lv_0;

public class 문자열_정수의_합 {
    public static void main(String[] args) {
        System.out.println(solution("123456789"));
        System.out.println(solution("1000000"));
    }

    public static int solution(String num_str) {
        int answer = 0;
        for (int i = 0; i < num_str.length(); i++) {
            answer += Character.getNumericValue(num_str.charAt(i));
        }
        return answer;
    }
}
