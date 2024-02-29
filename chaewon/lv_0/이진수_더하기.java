package lv_0;

public class 이진수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
        System.out.println(solution("1001", "1111"));
    }

    public static String solution(String bin1, String bin2) {
        int bin1Num = 0;
        int bin2Num = 0;
        int multiplier = bin1.length() - 1;

        if (bin1.equals("0") && bin2.equals("0")) return "0";

        for (int i = 0; i < bin1.length(); i++) {
            int k1 = Character.getNumericValue(bin1.charAt(i));
            bin1Num += (int) Math.pow(2, multiplier) * k1;
            multiplier--;
        }

        multiplier = bin2.length() - 1;
        for (int i = 0; i < bin2.length(); i++) {
            int k2 = Character.getNumericValue(bin2.charAt(i));
            bin2Num += (int) Math.pow(2, multiplier) * k2;
            multiplier--;
        }

        StringBuilder answer = new StringBuilder();
        int result = bin1Num + bin2Num;
        int rest;
        while (result > 1) {
            rest = result % 2;
            answer.append(rest);
            result /= 2;
            if (result == 1) answer.append(result);
        }

        return answer.reverse().toString();

        // 한 줄로 끝내는 간단한 방법이 있었다..
//        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2), 2);
    }
}
