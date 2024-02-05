package lv_0;

public class 나이_출력 {
    public static void main(String[] args) {
        System.out.println(solution(40));
        System.out.println(solution(23));
    }

    public static int solution(int age) {
        return (2022 - age) + 1;
        // LocalDate 사용하는 방법도 있음.
    }
}
