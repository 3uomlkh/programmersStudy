public class 가까운_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
        System.out.println(solution(new int[]{10, 11, 12}, 13));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        int diff = 0;
        int min = Integer.MAX_VALUE;

        // Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            diff = Math.abs(n - array[i]);
            if (diff < min) {
                answer = array[i];
                min = diff;
            } else if (diff == min) {
                answer = Math.min(answer, array[i]);
            }
        }

        return answer;
    }
}
