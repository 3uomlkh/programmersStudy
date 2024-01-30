import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_3 {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        int oneA = intervals[0][0];
        int oneB = intervals[0][1];
        int twoA = intervals[1][0];
        int twoB = intervals[1][1];
        List<Integer> answer = new ArrayList<>();

        for (int i=0; i<arr.length; i++) {
            if (i >= oneA && i <= oneB) {
                answer.add(i-oneA, arr[i]);
            }
        }
        for (int j=0; j<arr.length; j++) {
            if (j >= twoA && j<= twoB) {
                answer.add(j-twoA+oneB, arr[j]);
            }
        }

        return answer;
    }
}
