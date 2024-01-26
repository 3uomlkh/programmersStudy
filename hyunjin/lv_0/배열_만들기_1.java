import java.util.ArrayList;
import java.util.Collections;

public class 배열_만들기_1 {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i=1; i<=n; i++) {
            if (i % k ==0) {
                answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
