package lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PCCE_기출문제_10번_데이터_분석 {
    static int e, s;
    public static void main(String[] args) {
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        System.out.println(Arrays.deepToString(solution(data, ext, val_ext, sort_by)));
    }

    public static int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        switch (ext) {
            case "code" :
                e = 0;
                break;
            case "date" :
                e = 1;
                break;
            case "maximum" :
                e = 2;
                break;
            case "remain" :
                e = 3;
                break;
        }

        switch (sort_by) {
            case "code" :
                s = 0;
                break;
            case "date" :
                s = 1;
                break;
            case "maximum" :
                s = 2;
                break;
            case "remain" :
                s = 3;
                break;
        }

        ArrayList<int[]> list = new ArrayList<>();
        for (int[] d : data) {
            if (d[e] < val_ext) { // ext 기준으로 val_ext보다 작은 데이터만 뽑기
                list.add(d);
            }
        }

        // sort_by 기준으로 오름차순 정렬
        Collections.sort(list, (o1, o2)->{
            return o1[s] - o2[s];
        });

        int[][] answer = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
