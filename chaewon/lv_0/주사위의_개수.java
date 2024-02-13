package lv_0;

public class 주사위의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 1}, 1));
        System.out.println(solution(new int[] {10, 8, 6}, 3));
    }

    public static int solution(int[] box, int n) {
        int width = box[0] / n;
        int length = box[1] / n;
        int height = box[2] / n;
        return width * length * height;
    }
}
