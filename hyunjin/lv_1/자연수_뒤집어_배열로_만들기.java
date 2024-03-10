import java.util.Arrays;

public class 자연수_뒤집어_배열로_만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];
        int count = 0;

        while(n > 0) {
            answer[count]=(int)(n%10);
            n /= 10;
            count++;
        }

        return answer;
    }
}
