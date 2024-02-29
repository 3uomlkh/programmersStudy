public class 치킨_쿠폰 {
    public static void main(String[] args){
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    public static int solution(int chicken) {
        int answer = 0;
        int extraCupon = 0;

        while (chicken >= 10) {
            answer += chicken / 10;
            extraCupon += chicken % 10;
            chicken /= 10;
            chicken += extraCupon;
            extraCupon = 0;
        }

        return answer;
    }
}
