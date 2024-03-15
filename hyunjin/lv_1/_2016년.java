public class _2016년 {
    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }

    public static String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 각 월의 일수를 담은 배열
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        // 총 일 수를 담을 변수 선언
        int answer = 0;

        // a 이전의 총 일 수 더하기
        for (int i = 0; i < a - 1; i++) {
            answer += month[i];
        }

        // 남은 일수 더하기
        answer += b - 1;

        // 7로 나눈 나머지의 인덱스를 가진 요일 반환
        return day[answer % 7];
    }
}
