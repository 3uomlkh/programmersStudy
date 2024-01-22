package lv_00;

public class 두_수의_연산값_비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(2,91));
        System.out.println(solution(91,2));
    }

    public static int solution(int a, int b) {
        int i1 = Integer.parseInt(""+a+b);
        int i2 = 2 * a * b;

        return (i1 > i2 || i1 == i2) ? i1 : i2;
        // 다른 풀이에서 Math.max() 함수를 통해 최댓값을 쉽게 구할 수 있었음.
    }
}
