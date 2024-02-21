public class 편지 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
        System.out.println(solution("I love you~"));
    }

    public static int solution(String message) {
        int answer = 0;

        int messageNum = message.length();

        answer = messageNum * 2;

        return answer;
    }
}
