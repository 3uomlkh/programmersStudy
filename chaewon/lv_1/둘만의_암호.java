package lv_1;

public class 둘만의_암호 {
    public static void main(String[] args) {
        System.out.println(solution("aukks", "wbqd", 5));
    }

    // 풀이까지는 대충 맞았으나 헷갈린 문제 - 다시 풀어보기
    public static String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = 0; j < index; j++) {
                c++;
                if (c > 'z') c -= 26;
                if (skip.contains(String.valueOf(c))) j--;
            }
            answer.append(c);
        }

        return answer.toString();
    }
}

