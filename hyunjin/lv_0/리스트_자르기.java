import java.util.ArrayList;
import java.util.List;

public class 리스트_자르기 {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        int m = 0;

        if (n == 1) {
            for (int i=0; i<b; i++) {
                answer.add(i, num_list[i]);
            }
        } else if (n == 2) {
            for (int j=a; j<num_list.length; j++) {
                answer.add(j - a, num_list[j]);
            }
        } else if (n == 3) {
            for (int k=a; k<=b; k++) {
                answer.add(k - a, num_list[k]);
            }
        } else if (n == 4) {
            for (int l=a; l<=b; l++) {
                if ((l-a)%c ==0) {
                    answer.add(m, num_list[l]);
                    m++;
                }
            }
        }

        return answer;
    }
}