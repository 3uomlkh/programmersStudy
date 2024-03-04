package lv_0;

public class 옹알이_1 {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            for (String word : words) {
                babbling[i] = babbling[i].replace(word, "A");
            }
        }

        // 대문자로 바꾼 A의 개수를 세서 길이가 같은지 비교했는데,
        // 아예 바꾼 A를 replace로 모두 삭제해서 비어있는 문자열일때 answer++을 해준 풀이도 있음.(이쪽이 더 간단해보인다.)
        int upperCase;
        for (String s : babbling) {
            upperCase = 0;
            for (int j = 0; j < s.length(); j++) {
                if (Character.isLowerCase(s.charAt(j))) continue;
                else upperCase++;
            }
            if (s.length() == upperCase) answer++;
        }

        return answer;
    }
}
