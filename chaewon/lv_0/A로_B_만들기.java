package lv_0;

import java.util.Arrays;

public class A로_B_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
    }

    public static int solution(String before, String after) {
        int[] beforeArr = new int[122];
        int[] afterArr = new int[122];

        // before의 알파벳 개수를 담은 배열 생성
        for (int i = 0; i < before.length(); i++) {
            int idx = before.charAt(i) - 97;
            beforeArr[idx]++;
        }

        // after의 알파벳 개수를 담은 배열 생성
        for (int i = 0; i < after.length(); i++) {
            int idx = after.charAt(i) - 97;
            afterArr[idx]++;
        }

        // for 문을 사용하지 않고 char 배열을 정렬해서 해결할 수도 있다.

        // 두개의 배열이 같으면 1, 다르면 0
        return Arrays.equals(beforeArr, afterArr) ? 1 : 0;
    }
}
