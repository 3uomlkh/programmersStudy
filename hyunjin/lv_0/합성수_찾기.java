public class 합성수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;
        int[] count = new int[n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count[i - 1]++;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            if (count[k] >=3) {
                answer++;
            }
        }

        return answer;
    }
}
