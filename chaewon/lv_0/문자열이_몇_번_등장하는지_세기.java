package lv_0;

public class 문자열이_몇_번_등장하는지_세기 {
    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution("aaaa", "aa"));
    }

    // 헷갈린 문제 - startWith()로도 풀 수 있음.
    public static int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i <= myString.length() - pat.length(); i++) {
            if (sb.substring(i, i + pat.length()).equals(pat)) answer++;
        }
        return answer;
    }
}
