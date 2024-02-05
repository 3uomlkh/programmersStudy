package lv_0;

public class 일로_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {12, 4, 15, 1, 14}));
    }

    public static int solution(int[] num_list) {
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                    count++;
                } else {
                    num_list[i] = (num_list[i] - 1) / 2;
                    count++;
                }
            }
        }
        return count;
    }
}
