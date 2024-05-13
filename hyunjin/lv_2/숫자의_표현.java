public class 숫자의_표현 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            int sum = 0;
            for(int j = i; j <= n; j++){
                sum += j;

                if(sum >= n){
                    if(sum == n) answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
