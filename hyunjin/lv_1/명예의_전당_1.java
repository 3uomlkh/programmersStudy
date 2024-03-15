import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{10, 100, 20, 150, 1, 100, 200})));
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> showList = new ArrayList();

        for(int i=0; i < score.length; i++) {
            if(i < k) {
                showList.add(score[i]);
            }
            else {
                // score[i] 와 list 내 값 비교
                if(score[i] >= showList.get(0)){
                    showList.remove(0);
                    showList.add(score[i]);
                }
            }
            Collections.sort(showList);
            answer[i] = showList.get(0);
        }
//        int[] arr = new int[k];
//
//        for (int i = 0; i < k; i++) {
//            arr[i] = score[i];
//            answer[i] = arr[0];
//        }
//
//        for (int i = k; i < score.length; i++) {
//            if (arr[0] < score[i]) {
//                arr[0] = score[i];
//                Arrays.sort(arr);
//            }
//            answer[i] = arr[0];
//        }

        return answer;
    }
}
