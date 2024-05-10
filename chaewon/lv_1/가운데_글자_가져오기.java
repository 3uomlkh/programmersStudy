package lv_1;

public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int index = s.length() / 2;

        if (s.length() % 2 != 0) answer.append(s.charAt(index));
        else answer.append(s.charAt(index-1)).append(s.charAt(index));
        // subString으로도 풀수있음.

        return answer.toString();
    }
}
