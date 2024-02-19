package lv_0;

public class 가위_바위_보 {
    public static void main(String[] args) {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }

    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < rsp.length(); i++) {
            if (rsp.charAt(i) == '2') {
                answer.append("0");
            } else if (rsp.charAt(i) == '0') {
                answer.append("5");
            } else if (rsp.charAt(i) == '5') {
                answer.append("2");
            }
        }

        return answer.toString();
    }
}
