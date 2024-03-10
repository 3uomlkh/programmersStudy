package lv_1;

public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(11));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int myX = x;

        while (myX >= 10) {
            sum += myX % 10;
            myX /= 10;
        }

        if (x % (sum + myX) != 0) answer = false;

        return answer;
    }
}
