package lv_1;

public class 소수_만들기 {
    static int answer = 0;

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 4}));
        System.out.println(solution(new int[] {1, 2, 7, 6, 4}));
    }

    public static int solution(int[] nums) {
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int l = j + 1; l < nums.length; l++) {
                    sum = nums[i] + nums[j] + nums[l]; // 3개의 숫자를 더한 값
                    isPrime(sum); // 소수 판별
                }
            }
        }

        return answer;
    }

    // 소수 판별 알고리즘 - 그냥 외워두기
    public static void isPrime(int n) {
        if (n < 2) return; // 0과 1은 소수X
        if (n == 2) answer++; // 2는 소수O
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return; // 소수가 아닐 경우 return
        }
        // 위 반복문에서 약수를 갖고 있지 않으면 소수O
        answer++;
    }
}
