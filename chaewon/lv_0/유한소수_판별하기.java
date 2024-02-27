package lv_0;

public class 유한소수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(3, 21));
        System.out.println(solution(9, 9));
    }

    public static int solution(int a, int b) {
        // 최대공약수 구하기
        int max = 0;
        for (int i = 1 ; i <= a && i <=b; i++) {
            if (a % i == 0 && b % i == 0) max = i;
        }

        // 기약분수 완성
        a /= max;
        b /= max;

        while (b != 1) { // b가 1이 되면 탈출
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else { // 2와 5로 나눠질 수 없다면 무한소수이므로 2를 반환
                return 2;
            }
        }

        return 1;
    }

    // 검색해서 본 유클리드 호제법 - 두 수의 최대 공약수 구하기
    private int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
}
