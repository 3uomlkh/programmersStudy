package lv_2;

public class 예상_대진표 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7));
    }

    // 답을 보고 푼 문제 - 다시 풀기
    public static int solution(int n, int a, int b) {
        int answer = 0;

        // 번호가 짝수일 때 -> (번호 / 2)의 값이 다음 라운드의 번호가 됨.
        // 번호가 홀수일 때 -> (번호 + 1) / 2의 값이 다음 라운드의 번호가 됨.
        // int형 변수는 소수점이 버려지므로 굳이 짝/홀수 판단 필요X
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }
}
