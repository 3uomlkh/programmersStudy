package lv_1;

public class 문자열_나누기 {
    public static void main(String[] args) {
        System.out.println(solution("banana"));
        System.out.println(solution("aaabbaccccabba"));
    }

    // 답을 보고 푼 문제
    public static int solution(String s) {
        int answer = 0;
        int otherCount = 0;
        int xCount = 1;
        char x = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (x == ' ') {
                x = s.charAt(i);
                continue;
            }

            if (x == s.charAt(i)) xCount++; // x와 같을 경우 count
            else otherCount++; // x가 아닌 다른 글자가 나올 경우 count

            if (xCount == otherCount) { // 두 횟수가 같아지면
                x = ' ';
                answer++;
                otherCount = 0;
                xCount = 1;
            }
        }

        if (x != ' ') answer++;

        return answer;
    }
}
