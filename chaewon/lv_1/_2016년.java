package lv_1;

public class _2016년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    // 정답을 보고 푼 문제 - 헷갈림...다시 풀기
    public static String solution(int a, int b) {
        int answer = 0;
        String[] dayOfTheWeek = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < a - 1; i++) {
            answer += month[i];
        }

        answer += b - 1;

        return dayOfTheWeek[answer % 7];
    }
}
