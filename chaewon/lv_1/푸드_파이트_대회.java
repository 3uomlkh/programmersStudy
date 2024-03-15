package lv_1;

public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 3, 4, 6}));
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i]/2; j++) {
                sb.append(i);
            }

            // 위 for문 대신 Intellij가 추천해준 repeat으로 반복하기
//            sb.append(String.valueOf(i).repeat(Math.max(0, food[i] / 2)));
        }

        StringBuilder answer = new StringBuilder(sb.toString());
        sb.append("0").reverse();
        answer.append(sb);

        return answer.toString();
    }
}
