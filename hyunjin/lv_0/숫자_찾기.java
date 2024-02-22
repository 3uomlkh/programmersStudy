public class 숫자_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));
    }

    public static int solution(int num, int k) {
        int answer = 0;

        answer = String.valueOf(num).indexOf(String.valueOf(k)) + 1;

        if (answer == 0) {
            answer = -1;
        }

        return answer;
    }
}
