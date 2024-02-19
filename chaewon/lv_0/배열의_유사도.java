package lv_0;

public class 배열의_유사도 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String s : s1) {
            for (String string : s2) {
                if (s.equals(string)) answer++;
            }
        }

        return answer;
    }
}
