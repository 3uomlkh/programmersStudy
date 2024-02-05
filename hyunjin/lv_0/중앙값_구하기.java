import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 7, 10, 11}));
        System.out.println(solution(new int[]{9, -1, 0}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        int arrNum = array.length;

        Arrays.sort(array);

        if (arrNum % 2 == 0) {
            answer = array[arrNum / 2 - 1];
        } else {
            answer = array[arrNum / 2];
        }
        return answer;
    }
}
