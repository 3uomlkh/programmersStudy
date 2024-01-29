public class 가까운_1_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1));
        System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4));
        System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3));
    }

    public static int solution(int[] arr, int idx) {
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }
}
