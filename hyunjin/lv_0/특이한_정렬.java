import java.util.Arrays;

public class 특이한_정렬 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
    }
    
    public static int[] solution(int[] numlist, int n) {

        Arrays.sort(numlist);

        for(int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (Math.abs(n - numlist[i]) <= Math.abs(n - numlist[j])) {
                    int temp = numlist[i];
                    numlist[i] = numlist[j];
                    numlist[j] = temp;
                }
            }
        }

        return numlist;
    }
}
