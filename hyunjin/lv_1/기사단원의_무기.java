public class 기사단원의_무기 {
    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2));
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int arr[] = new int[number];

        for(int i = 0; i < number; i++) {
            arr[i] = prime(i + 1);

            if(arr[i] > limit) arr[i] = power;

            answer += arr[i];
        }

        return answer;
    }

    public static int prime(int n) {
        int result = 0;

        for(int i = 1; i * i <= n; i++) {
            if(i * i == n) result += 1;
            else if(n % i == 0) result += 2;
        }

        return result;
    }
}
