package lv_00;

public class 주사위_게임_2 {
    public static void main(String[] args) {
        System.out.println(solution(2,6,1));
        System.out.println(solution(5,3,3));
        System.out.println(solution(4,4,4));
    }

    public static int solution(int a, int b, int c) {
        int answer;

        if (a != b && a != c && b != c) {
            answer = a + b + c;
        } else if ((a == b && a != c) || (a == c && a !=b) || (c == b && c != a)) {
            answer = (a + b + c) * (a*a + b*b + c*c);
        } else {
            answer = (a + b + c) * (a*a + b*b + c*c) * (a*a*a + b*b*b + c*c*c) ;
        }

        return answer;
    }
}
