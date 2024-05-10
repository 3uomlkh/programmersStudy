package lv_1;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;

        String str = n + "";
        for (char c : str.toCharArray()) {
            answer += Character.getNumericValue(c);
        }

        // 다른 풀이 - 형 변환 없이 해결 가능!
//        while (true) {
//            answer += n % 10;
//            if (n < 10) break;
//
//            n /= 10;
//        }

        return answer;
    }
}
