package lv_1;

public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p); // p의 길이가 18 이하이므로 Long으로

        for (int i = 0; i < t.length(); i++) {
            if (i+p.length() <= t.length()) {
                long tNum = Long.parseLong(t.substring(i, i+p.length()));
                if (tNum <= pNum) answer++;
            }
        }

        return answer;
    }
}
