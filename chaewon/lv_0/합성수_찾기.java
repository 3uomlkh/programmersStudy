package lv_0;

public class 합성수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;
        int count;

        for (int i = 4; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) count++; // 약수의 개수 세기
            }
            if (count >= 3) answer++; // 약수의 개수가 3개 이상이라면 answer 1 증가
        }

        return answer;
    }
}
