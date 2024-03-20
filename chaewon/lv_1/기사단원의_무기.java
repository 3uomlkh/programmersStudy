package lv_1;

public class 기사단원의_무기 {
    public static void main(String[] args) {
        System.out.println(solution(10, 3, 2));
    }

    // 시간 초과로 틀린 문제 : N의 약수를 찾을 때, 1 ~ N까지 모두 탐색하면 시간 초과 확률 높음.
    // 소인수 분해 or N의 제곱근으로 범위를 좁혀 탐색하기!
    public static int solution(int number, int limit, int power) {
        int[] count = new int[number];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (i / j == j) count[index]++;
                    else count[index]+=2;
                }
            }
            index++;
        }

        int answer = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] > limit ? power : count[i];
            answer += count[i];
        }

        return answer;
    }
}
