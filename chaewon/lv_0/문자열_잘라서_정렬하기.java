package lv_0;

import java.util.ArrayList;
import java.util.Arrays;

public class 문자열_잘라서_정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("axbxcxdx")));
        System.out.println(Arrays.toString(solution("dxccxbbbxaaaa")));
        System.out.println(Arrays.toString(solution("axbxcx xdx")));
    }

    public static String[] solution(String myString) {
        ArrayList<String> strs = new ArrayList<>(Arrays.asList(myString.split("x")));
        strs.removeAll(Arrays.asList(" ", "", null)); // 공백, 빈 문자열, null값 제거
        String[] answer = strs.toArray(new String[strs.size()]);
        Arrays.sort(answer);
        return answer;
    }
}
