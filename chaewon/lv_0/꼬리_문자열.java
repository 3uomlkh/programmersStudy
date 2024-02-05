package lv_0;

public class 꼬리_문자열 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"abc", "def", "ghi"}, "ef"));
    }

    public static String solution(String[] str_list, String ex) {
        String answer = "";

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].contains(ex)) str_list[i] = "";
        }

        for (String s : str_list) {
            answer += s;
        }

        return answer;
    }
}
