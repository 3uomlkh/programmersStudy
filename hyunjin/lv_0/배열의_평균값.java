public class 배열의_평균값 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(solution(new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99}));
    }

    public static double solution(int[] numbers) {
        double answer = 0;
        int hap = 0;

        for (int i = 0; i < numbers.length; i++) {
            hap += numbers[i];
        }

        answer = (double) hap / numbers.length;

        return answer;
    }
}
