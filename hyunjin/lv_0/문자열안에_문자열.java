public class 문자열안에_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
        System.out.println(solution("ppprrrogrammers", "pppp"));
        System.out.println(solution("AbcAbcA", "AAA"));
    }

    public static int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
