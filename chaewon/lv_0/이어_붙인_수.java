package lv_00;

public class 이어_붙인_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
        System.out.println(solution(new int[] {5, 7, 8, 3}));
    }

    public static int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for (int i : num_list) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }

        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}
