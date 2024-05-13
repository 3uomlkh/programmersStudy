package lv_2;

public class 다음_큰_숫자 {
    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }

    public static int solution(int n) {
        int answer;
        int oneCount1 = getOneCount(n);
        int oneCount2;
        int biggerN = n + 1;

        while (true) {
            oneCount2 = getOneCount(biggerN);
            if (oneCount1 == oneCount2) {
                answer = biggerN;
                break;
            }
            biggerN++;
        }
        Integer.bitCount(9);
        return answer;
    }

    // 2진수로 변환했을 때 1의 개수를 세는 메서드
    // Integer.bitCount() 메서드가 따로 있었다..! 파라미터에 정수를 넣으면 정수의 이진수에서 1의 개수를 반환한다.
    public static int getOneCount(int num) {
        int count = 0;

        while (num >= 1) {
            if (num % 2 == 1) count++;
            num = num / 2;
        }

        return count;
    }
}
