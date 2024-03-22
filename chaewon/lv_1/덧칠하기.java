package lv_1;

public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[] {2, 3, 6}));
    }

    // 답안을 보고 푼 문제 - 다시 풀기
    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];
        answer++;

        for (int i : section) {
            if (start + m > i) continue;
            start = i;
            answer++;
        }

        return answer;
    }
}
