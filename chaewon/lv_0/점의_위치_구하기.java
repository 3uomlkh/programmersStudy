package lv_0;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 4}));
        System.out.println(solution(new int[] {-7, 9}));
        System.out.println(solution(new int[] {-5, -5}));
    }

    public static int solution(int[] dot) {
        int answer = 1;
        int x = dot[0];
        int y = dot[1];

        if (x > 0) {
            if (y < 0) return 4;
        } else {
            if (y > 0) return 2;
            else return 3;
        }

        return answer;
    }
}
