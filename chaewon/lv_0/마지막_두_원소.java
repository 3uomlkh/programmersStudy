import java.util.Arrays;

public class 마지막_두_원소 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6})));
        System.out.println(Arrays.toString(solution(new int[]{5, 2, 1, 7, 5})));
    }

    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int last = num_list[num_list.length - 1];
        int last2 = num_list[num_list.length - 2];
        int add;

        System.arraycopy(num_list, 0, answer, 0, num_list.length);

        if (last > last2) add = last - last2;
        else add = last * 2;

        answer[answer.length - 1] = add;

        return answer;
    }
}
