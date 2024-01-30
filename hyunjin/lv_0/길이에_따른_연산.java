public class 길이에_따른_연산 {
    public int solution(int[] num_list) {
        int answer = 0;

        for (int i=0; i<num_list.length; i++) {
            if (num_list.length >= 11) {
                answer += num_list[i];
            } else if (num_list.length <= 10) {
                if (answer == 0) {
                    answer++;
                }
                answer *= num_list[i];
            }
        }
        return answer;
    }
}
