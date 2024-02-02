package lv_0;

public class 정사각형으로_만들기 {
    public static void main(String[] args) {
        int[][] arr = {{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        System.out.println(solution(arr));
    }

    public static int[][] solution(int[][] arr) {
        int max_size = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[max_size][max_size]; // 초기화 -> 0

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j]; // 빈자리에는 자연스럽게 0이 채워짐
            }
        }

        return answer;
    }
}
