public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }

    public static String solution(String s) {
        String answer = "";
        int sNum = s.length();

        if (sNum % 2 == 0) {
            answer = s.substring((sNum / 2) - 1, (sNum / 2) + 1);
        } else {
            answer = s.substring((sNum / 2), (sNum / 2) + 1);
        }

        return answer;
    }
}
