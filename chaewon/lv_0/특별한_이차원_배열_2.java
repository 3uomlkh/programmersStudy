package lv_0;

public class 특별한_이차원_배열_2 {
    public static void main(String[] args) {
        int[][] arr = {{5, 192, 33}, {192, 72, 95}, {33, 95, 999}};
        System.out.println(solution(arr));
    }

    public static int solution(int[][] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    answer = 1;
                } else {
                    return 0;
                }
            }
        }

        return answer;
    }
}
