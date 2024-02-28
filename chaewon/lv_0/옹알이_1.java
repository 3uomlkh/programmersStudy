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
            for (int j = 0; j < words.length; j++) {
                babbling[i] = babbling[i].replace(words[j], "A");
            }
        }

        int upperCase = 0;
        for (int i = 0; i < babbling.length; i++) {
            upperCase = 0;
            for (int j = 0; j < babbling[i].length(); j++) {
                if (Character.isLowerCase(babbling[i].charAt(j))) continue;
                else upperCase++;
            }
            if (babbling[i].length() == upperCase) answer++;
        }

        return answer;
    }
}
