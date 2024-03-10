package lv_1;

public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,2,3,4,6,7,8,0}));
    }

    public static int solution(int[] numbers) {
        int answer = 45;
        for (int i : numbers) answer -= i;
        return answer;
    }

}
