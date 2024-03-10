import java.util.Arrays;

public class x만큼_간격이_있는_n개의_숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2, 5)));
        System.out.println(Arrays.toString(solution(4, 3)));
        System.out.println(Arrays.toString(solution(-4, 2)));
    }
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 0;

        while (count != n) {
            answer[count] = x * ((long)count + 1);
            count++;
        }

        return answer;
    }
}
