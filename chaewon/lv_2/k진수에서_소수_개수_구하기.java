package lv_2;

public class k진수에서_소수_개수_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(437674, 3));
        System.out.println(solution(110011, 10));
    }
    public static int solution(int n, int k) {
        String kNumber = Long.toString(n, k);
        String[] pArr = kNumber.split("0");

        int pCount = 0;

        for (String p : pArr) {
            if (p.isEmpty() || p.isBlank()) continue;
            if (isPrime(Long.parseLong(p))) pCount++;
        }

        return pCount;
    }

    public static boolean isPrime(long n) {
        if (n == 1) return false;
        if (n == 2) return true;

        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
