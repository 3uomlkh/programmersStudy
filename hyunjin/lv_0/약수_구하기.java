import java.util.ArrayList;
import java.util.List;

public class 약수_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(24));
        System.out.println(solution(29));
    }

    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer.add(count, i);
                count++;
            }
        }
        return answer;
    }
}
