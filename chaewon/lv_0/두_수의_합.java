package lv_0;

import java.math.BigInteger;

public class 두_수의_합 {
    public static void main(String[] args) {
        System.out.println(solution("582", "734"));
        System.out.println(solution("18446744073709551615", "287346502836570928366"));
        System.out.println(solution("0", "0"));
    }

    // BigInteger라는 것을 처음 알았다!
    public static String solution(String a, String b) {
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        return sum.toString();
    }
}
