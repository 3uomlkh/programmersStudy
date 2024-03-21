public class 덧칠하기 {
    public static void main(String[] args) {
        System.out.println(solution(8, 4, new int[]{2, 3, 6}));
    }
    public static int solution(int n, int m, int[] section) {
        int answer = 0;

        int start = section[0];

        answer++;

        for (int item : section) {
            if (start + m > item) {
                continue;
            }

            start = item;
            answer++;
        }

        return answer;
    }
}
