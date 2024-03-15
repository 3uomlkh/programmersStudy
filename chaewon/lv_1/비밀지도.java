package lv_1;

import java.util.Arrays;

public class 비밀지도 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};
        System.out.println(Arrays.toString(solution(n, arr1, arr2)));
    }

    // 정답을 보고 푼 문제 - 다시 풀기(+비트 마스킹에 대해 공부)
    // 헤맨 부분 : 이진수로 바꾼 후 비어있는 부분을 어떻게 0으로 채울까? -> 배열이 아닌 문자열에서 해결

    // 비트 연산으로 풀기
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for(int i = 0; i < n; i++) {
            String bi = Integer.toBinaryString(arr1[i] | arr2[i]);
            bi = "0".repeat(n - bi.length()) + bi;
            answer[i] = bi.replaceAll("1", "#").replaceAll("0", " ");
        }
        return answer;
    }

    // 문자열 비교로 풀기
    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);
            binary1 = "0".repeat(n - binary1.length()) + binary1;
            binary2 = "0".repeat(n - binary2.length()) + binary2;
            String[] biArr1 = binary1.split("");
            String[] biArr2 = binary2.split("");
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (biArr1[j].equals("1") || biArr2[j].equals("1")) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
                answer[i] = sb.toString();
            }
        }

        return answer;
    }
}
