public class 카운트_다운 {
    public int[] solution(int start, int end_num) {
        int num = start - end_num + 1;
        int[] answer = new int[num];

        for (int i=0; i<num; i++) {
            answer[i] = start;
            start -= 1;
        }
        return answer;
    }
}