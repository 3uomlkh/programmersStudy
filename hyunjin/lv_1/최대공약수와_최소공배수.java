import java.util.Arrays;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, 12)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        if (m % n == 0) {
            answer[0] = n;
            answer[1] = m;
        } else {
            for (int i = 1; i <= m; i++){
                if (n % i == 0 && m % i == 0){
                    answer[0] = i;
                }
            }
            answer[1] = n*m/answer[0];
        }
        return answer;
    }
}
