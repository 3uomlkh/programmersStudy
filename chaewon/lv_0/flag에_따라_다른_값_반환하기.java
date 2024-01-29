package lv_0;

public class flag에_따라_다른_값_반환하기 {
    public static void main(String[] args) {
        System.out.println(solution(-4,7,true));
        System.out.println(solution(-4,7,false));
    }

    public static int solution(int a, int b, boolean flag) {
        return flag ? (a + b) : (a - b);
    }
}
