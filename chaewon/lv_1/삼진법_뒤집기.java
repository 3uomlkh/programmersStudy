package lv_1;

public class 삼진법_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }

    public static int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }

        sb.reverse();
        int answer = 0;
        for (int i = 0; i < sb.toString().length(); i++) {
            answer += (int) (Math.pow(3, i) * Character.getNumericValue(sb.toString().charAt(i)));
        }

        // parseInt로 쉽게 진수 변환을 할 수 있다는 것을 알았다!
//        return Integer.parseInt(sb.toString(),3);

        return answer;
    }
}
