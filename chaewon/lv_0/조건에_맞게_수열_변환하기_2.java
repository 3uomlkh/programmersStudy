package lv_0;

import java.util.Arrays;

public class 조건에_맞게_수열_변환하기_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 100, 99, 98}));
        System.out.println(solution(new int[] {2}));
    }

    public static int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] arr2;

        while(count != arr.length) {
            count = 0;
            arr2 = arr.clone();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                }
                if (arr[i] == arr2[i]) count++;
            }
            System.out.println(Arrays.toString(arr));

            answer++;
        }

        return answer - 1;
    }
}
