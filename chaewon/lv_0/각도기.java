package lv_0;

public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(70));
        System.out.println(solution(91));
        System.out.println(solution(181));
    }

    public static int solution(int angle) {
        int answer = 0;
        if (angle < 90) { // 예각
            answer = 1;
        } else if (angle == 90) { // 직각
            answer = 2;
        } else if (angle < 180) { // 둔각
            answer = 3;
        } else if (angle == 180) { // 평각
            answer = 4;
        }
        return answer;
    }
}
