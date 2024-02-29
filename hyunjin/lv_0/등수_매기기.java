import java.util.Arrays;

public class 등수_매기기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
    }

    public static int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];

        for(int i=0; i<score.length; i++) {
            avg[i] = (double)(score[i][0] + score[i][1]) / 2;
        }

        for(int i=0; i<avg.length; i++) {
            int rank = 1;
            for(int j=0; j<avg.length; j++) {
                if(avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}
