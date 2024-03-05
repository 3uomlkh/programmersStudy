package lv_1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        String[] strArr = String.valueOf(n).split("");
        // 내림차순 정렬 기억! 내림차순 정렬은 Primitive Type에는 적용X, Wapper Class에만!
        Arrays.sort(strArr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s);
        }

        return Long.parseLong(sb.toString());
    }

}
