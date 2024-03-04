package lv_0;

public class 다음에_올_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));
        System.out.println(solution(new int[] {2, 4, 8}));
    }

    public static int solution(int[] common) {
        int answer;
        int a = common[1] - common[0];
        int b = common[2] - common[1];

        if (a == b) { // 등차수열이라면
            answer = common[common.length - 1] + a;
        } else { // 등비수열이라면
            int c = common[1] / common[0];
            answer = common[common.length - 1] * c;
        }

        return answer;
    }
}
