public class 마지막_두_원소 {
    public static int[] solution(int[] num_list) {
        int n = num_list.length;
        int[] answer = new int[n + 1];
        int ans = 0;

        if (num_list[n-1] > num_list[n-2]) {
            ans = num_list[n-1] - num_list[n-2];
        } else {
            ans = num_list[n-1] * 2;
        }

        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }

        answer[n] = ans;
        return answer;
    }
}
