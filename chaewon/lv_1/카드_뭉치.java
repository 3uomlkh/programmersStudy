package lv_1;

import java.util.ArrayList;

public class 카드_뭉치 {
    public static void main(String[] args) {
        String[] cards1 = {"i", "water", "drink"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();

        for (String s : goal) {
            arr.add(s);
            arr2.add(s);
        }

        for (int i = 0; i < goal.length; i++) {
            for (String c1 : cards1) {
                if (goal[i].equals(c1)) arr.remove(goal[i]);
            }

            for (String c2 : cards2) {
                if (goal[i].equals(c2)) arr2.remove(goal[i]);
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!cards2[i].equals(arr.get(i))) {
                answer = "No";
                break;
            }
        }

        for (int i = 0; i < arr2.size(); i++) {
            if (!cards1[i].equals(arr2.get(i))) {
                answer = "No";
                break;
            }
        }

        return answer;
    }

    // 다름 사람의 풀이 중 좀 더 간결한 풀이
    public static String solution2(String[] cards1, String[] cards2, String[] goal) {
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for (String target : goal) {
            if (cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
                cardIdx1++;
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
                cardIdx2++;
            else
                return "No";
        }

        return "Yes";
    }
}
