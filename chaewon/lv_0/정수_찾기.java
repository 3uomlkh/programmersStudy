package lv_0;

public class 정수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4, 5}, 3));
    }

    public static int solution(int[] num_list, int n) {
        int answer = 0;
        for (int i : num_list) {
            if (i == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
