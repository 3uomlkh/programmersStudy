public class 유한소수_판별하기 {
    public static void main(String[] args) {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21)); // 실행 시간이 너무 길다 -> 해결 방식 찾아보(아래 작성됨)
    }

    public static int solution(int a, int b) {
        int answer = 1;
        int num = 0;

        for (int i = a; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                num = i;
                break;
            }
        }

        b /= num;

        while (b != 1) {
            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 5 == 0) {
                b /= 5;
            } else {
                answer =  2;
            }
        }

        return answer;
        // return answer을 사용하지 말고 return 숫자; 형태로 바로 사용해주어 실행 시간을 줄인다.

    }

    // 유클리드 호제법 사용하면 최대공약수를 구할 수 있다. -> 실행 시간을 줄여준다.
//    private int GCD(int a, int b) {
//        if (b == 0) {
//            return a;
//        } else {
//            return GCD(b, a % b);
//        }
//    }
}
