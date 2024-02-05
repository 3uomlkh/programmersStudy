package lv_0;

public class 영_떼기 {
    public static void main(String[] args) {
        System.out.println(solution("0010"));
        System.out.println(solution("854020"));
    }

    public static String solution(String n_str) {
        String answer = "";

        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) != '0') {
                for (int j = i; j < n_str.length(); j++) {
                    answer += n_str.charAt(j);
                }
                break;
            }
        }

        return answer;
    }
}
