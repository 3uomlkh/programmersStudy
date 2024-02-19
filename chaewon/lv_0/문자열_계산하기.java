package lv_0;

public class 문자열_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 4"));
        System.out.println(solution("20 + 10 - 10"));
    }

    public static int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i++) {
            if (i % 2 != 0) {
                if (str[i].equals("+")) {
                    answer += Integer.parseInt(str[i + 1]);
                } else {
                    answer -= Integer.parseInt(str[i + 1]);
                }
            }
        }

        return answer;
    }
}
