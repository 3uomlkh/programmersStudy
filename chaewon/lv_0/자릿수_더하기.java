package lv_0;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(1234));
    }

    public static int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += Character.getNumericValue(str.charAt(i));
        }

        // 굳이 String으로 변환하지 않고 푸는방법
//        while (n > 0) {
//            answer += n % 10;
//            n /= 10;
//        }

        return answer;
    }
}
