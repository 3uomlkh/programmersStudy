import java.util.Arrays;

public class n번째_원소까지 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) answer[i] = num_list[i];
        return answer;
    }
}
