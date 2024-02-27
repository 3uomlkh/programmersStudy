package lv_0;

public class 저주의_숫자_3 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 1;
        int count = 1;

        while (n > count) {
            count++;
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) answer++;
        }

        return answer;
    }

}
