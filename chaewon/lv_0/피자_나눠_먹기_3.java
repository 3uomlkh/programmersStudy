package lv_0;

public class 피자_나눠_먹기_3 {
    public static void main(String[] args) {
        System.out.println(solution(7, 10));
        System.out.println(solution(4, 12));
    }

    public static int solution(int slice, int n) {
        int answer = n / slice;

        if (n % slice != 0) answer++;

        return answer;
    }
}
