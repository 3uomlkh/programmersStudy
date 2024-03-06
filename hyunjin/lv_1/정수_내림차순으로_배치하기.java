import java.util.Arrays;

public class 정수_내림차순으로_배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;
        String str = "" + n;
        int tr = 1;

        String[] arr = str.split("");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            answer += Long.parseLong(arr[i]) * tr;
            tr *= 10;
        }

        return answer;
    }
}
