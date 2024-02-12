public class 공_던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4}, 2));
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution(new int[]{1, 2, 3}, 3));
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;

        while (--k > 0) {
            answer += 2;
        }

        answer = numbers[answer % numbers.length];

        return answer;
    }
}
