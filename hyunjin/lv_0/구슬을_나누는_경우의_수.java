public class 구슬을_나누는_경우의_수 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2));
        System.out.println(solution(5, 3));
    }

    public static int solution(int balls, int share) {
        long answer = 1;
        int a = 1;
        for(int i = share+1; i <= balls; i++){
            answer *= i;
            answer /= a;
            a++;
        }

        return (int)answer;
    }
}
