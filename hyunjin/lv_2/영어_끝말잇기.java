import java.util.*;

public class 영어_끝말잇기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        String[] check = new String[words.length];
        int whoNum = 0;
        int howNum = 0;

        check[0] = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                whoNum = i % n + 1;
                howNum = i / n + 1;
                break;
            } else if (Arrays.asList(check).contains(words[i])) {
                whoNum = i % n + 1;
                howNum = i / n + 1;
                break;
            } else if (words[i].length() == 1) {
                whoNum = i % n + 1;
                howNum = i / n + 1;
                break;
            } else {
                check[i] = words[i];
            }
        }

        answer[0] = whoNum;
        answer[1] = howNum;

        return answer;
    }
}
