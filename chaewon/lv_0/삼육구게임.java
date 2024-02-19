package lv_0;

public class 삼육구게임 {
    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(29423));
    }

    public static int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);

        for (char c : str.toCharArray()) {
            if (c == '3' || c == '6' || c == '9') answer++;
        }

        return answer;
    }
}
