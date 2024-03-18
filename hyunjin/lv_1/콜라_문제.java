public class 콜라_문제 {
    public static void main(String[] args) {
        System.out.println(solution(3, 2, 20));
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }

        return answer;
    }
}


// 3, 2, 20
// n개 중 n-n%a n/a*b n/a*b+n%a
// 1번째 20개 중 18개 가져가서 6*2=12개로 바꿔오기, 남은것 12 + 2
// 2번째 14개 중 12개 가져가서 4*2=8개로 바꿔오기, 남은 것 8 + 2
// 3번째 10개 중 9개 가져가서 3*2=6개로 바꿔오기, 남은 것 6 + 1
// 4번째 7개 중 6개 가져가서 2*2=4개로 바꿔오기, 남은 것 4 + 1
// 5번째 5개 중 3개 가져가서 1*2=2개로 바꿔오기, 남은 것 2 + 2
// 6번째 4개 중 3개 가져가서 1*2=2개로 바꿔오기, 남은 것 2 + 1
// 7번째 3개 중 3개 가져가서 1*2=2개로 바꿔오기, 남은 것 2