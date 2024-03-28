package lv_1;

public class 옹알이_2 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    // 답을 보고 푼 문제 - replaceAll 활용해보기
    public static int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            // replaceAll에서 정규식 사용
            s = s.replaceAll("ayaaya|yeye|woowoo|mama", " "); // 반복되는 단어가 나오면 공백으로 대체
            s = s.replaceAll("aya|ye|woo|ma", ""); // 맞는 단어가 나오면 없애기
            if (s.isEmpty()) answer++; // 모두 비어있는 문자열일 때(= 맞는 단어로만 이루어져 있을 때) answer 증가 시키기
        }

        return answer;
    }
}
