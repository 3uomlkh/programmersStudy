public class 하샤드_수 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(11));
        System.out.println(solution(12));
        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        boolean answer = true;
        int hap = 0;
        int resultX = x;

        while(resultX > 0) {
            hap += (resultX % 10);
            resultX /= 10;
        }

        if (x % hap != 0) {
            answer = false;
        }

        return answer;
    }
}
