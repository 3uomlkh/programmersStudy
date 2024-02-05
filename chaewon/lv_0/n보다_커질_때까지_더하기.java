package lv_0;

public class n보다_커질_때까지_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {34, 5, 71, 29, 100, 34}, 123));
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;
        int result = 0;

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
            if (result > n) {
                answer = result;
                break;
            }
        }

        return answer;
    }
}
