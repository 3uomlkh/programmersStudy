package lv_0;

public class 암호_해독 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
        System.out.println(solution("pfqallllabwaoclk", 2));
    }

    public static String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();

        for (int i = code; i <= cipher.length(); i++) {
            if (i % code == 0) {
                answer.append(cipher.charAt(i - 1));
            }
        }

        // subString()으로 푸는 방법
//        String a = "";
//        for (int i = code; i <= cipher.length(); i = i + code) {
//            a += cipher.substring(i - 1, i);
//            System.out.println(a);
//        }

        return answer.toString();
    }
}
