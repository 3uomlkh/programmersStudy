import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {
    public static void main(String[] args) {
        System.out.println(solution(12));
        System.out.println(solution(17));
        System.out.println(solution(420));
    }

    public static List<Integer> solution(int n) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> divisor = new ArrayList<>();
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                divisor.add(i);
            }
        }

        for (int j = 0; j < divisor.size(); j++) {
            for (int k = 2; k <= n; k++) {
                if (divisor.get(j) % k == 0) {
                    count++;
                }
            }

            if (count == 1) {
                answer.add(divisor.get(j));
            }
            count = 0;
        }

        return answer;
    }
}
