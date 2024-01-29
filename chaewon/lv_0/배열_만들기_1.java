import java.util.ArrayList;

public class 배열_만들기_1 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
    }

    // n / k 로 배열의 크기를 정하는 방법도 있었다!
    public static ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % k == 0) answer.add(i);
        }
        return answer;
    }
}
