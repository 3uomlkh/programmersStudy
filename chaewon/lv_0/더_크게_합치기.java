package lv_0;

public class 더_크게_합치기 {
    public static void main(String[] args) {
        System.out.println(solution(9,91));
        System.out.println(solution(89,8));
    }

    public static int solution(int a, int b) {
        String s1 = "" + a + b;
        String s2 = "" + b + a;

        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);

        return (i1 > i2 || i1 == i2) ? i1 : i2;
    }
}
