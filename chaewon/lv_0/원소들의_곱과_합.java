package lv_0;

public class 원소들의_곱과_합 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        int a = 1;
        int b = 0;

        for (int i : num_list) {
            a *= i;
            b += i;
        }

        return (a < b*b) ? 1 : 0;
    }
}
