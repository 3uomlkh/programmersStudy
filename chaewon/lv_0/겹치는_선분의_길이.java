package lv_0;

public class 겹치는_선분의_길이 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{0, 1}, {2, 5}, {3,9}}));
    }

    // 답을 보고 푼 문제 - 나중에 다시 풀어보기
    public static int solution(int[][] lines) {
        int answer = 0;
        int[] count = new int[201]; // 점의 범위(-100 ~ 100)만큼의 배열을 생성

        // 선분이 지나가는 점을 찾기
        for (int[] line : lines) {
            int start = line[0] + 100;
            int end = line[1] + 100;

            for (int i = start; i < end; i++) {
                count[i]++;
            }
        }

        for (int c : count) {
            if (c > 1) answer++;
        }

        return answer;
    }
}
