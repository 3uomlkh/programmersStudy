package lv_0;

public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
        System.out.println(solution(30, 10));
    }

    // 잘 안풀려서 답을 보고 푼 문제
    public static int solution(int balls, int share) {
        long answer = 1;
        int shareIndex = 1;

        /* 분자 : balls! -> balls * balls - 1 * ... * 1
                        -> 5 * 4 * 3 * 2 * 1
         */

        /* 분모 : (balls - share)! * share! -> ((balls - share) * (balls - share - 1) * ... * 1) * share * share - 1 * ... * 1
                                           -> (2 * 1) * (3 * 2 * 1)
         */

        // 공통된 부분 (3 * 2 * 1)을 없애면 -> 분자 5 * 4, 분모 2 * 1

        for (int i = share + 1; i <= balls; i++){
            answer *= i; // share + 1(== 4)부터 balls(== 5)까지 곱하기
            answer /= shareIndex; // share로 나누고 그 값을 answer에 대입
            shareIndex++;
        }

        return (int) answer;
    }
}
