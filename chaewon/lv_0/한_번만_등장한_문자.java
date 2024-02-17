package lv_0;

public class 한_번만_등장한_문자 {
    public static void main(String[] args) {
        System.out.println(solution(solution("abcabcadc")));
        System.out.println(solution(solution("abcd")));
        System.out.println(solution(solution("hello")));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int[] c = new int[26]; // a ~ z 개수를 셀 배열

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 97;
            c[index]++;
        }

        for (int i = 0; i < c.length; i++) {
            if (c[i] == 1) answer.append((char) (i + 97));
        }

        return answer.toString();
    }
}
