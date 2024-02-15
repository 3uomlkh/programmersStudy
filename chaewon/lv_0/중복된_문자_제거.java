package lv_0;

public class 중복된_문자_제거 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
        System.out.println(solution("We are the world"));
    }
    public static String solution(String my_string) {
        String answer = "";

        for (Character c : my_string.toCharArray()) {
            if (!answer.contains(Character.toString(c))) answer += c;
        }

        return answer;
    }

}
