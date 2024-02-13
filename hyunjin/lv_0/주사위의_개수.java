public class 주사위의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1}, 1));
        System.out.println(solution(new int[]{10, 8, 6}, 3));
    }
    public static int solution(int[] box, int n) {
        int answer = 0;
        int w = box[0];
        int h = box[1];
        int d = box[2];

        answer = (w / n) * (h / n) * (d / n);

        return answer;
    }
}
