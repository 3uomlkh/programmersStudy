public class 다음_큰_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;
        int count = Integer.bitCount(n);

        while(true){
            n++;
            int nextCount = Integer.bitCount(n);
            if(count == nextCount){
                answer = n;
                break;
            }
        }
        return answer;
    }
}
