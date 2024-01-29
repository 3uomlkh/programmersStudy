package lv_0;

public class 문자_리스트를_문자열로_변환하기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }

    public static String solution(String[] arr) {
        String answer = "";

        for (String c : arr) answer += c;

        return answer;
    }
}
