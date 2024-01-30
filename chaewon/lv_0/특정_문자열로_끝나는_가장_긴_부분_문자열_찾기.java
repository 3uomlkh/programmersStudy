package lv_0;

public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
        System.out.println(solution("AAAAaaaa", "a"));
    }

    // 헷갈린 문제
    public static String solution(String myString, String pat) {
        String answer = "";
        int mLength = myString.length();

        for (int i = mLength - 1; i >= 0; i--) {
            String substr = myString.substring(0, i + 1);
            /*
                i == 6: AbCdEFG
                i == 5: AbCdEF
                i == 4: AbCdE
             */
            if (substr.endsWith(pat)) { // 현재 문자열이 pat으로 끝나는지 확인
                answer = substr;
                break;
            }
        }
        return answer;
    }
}
