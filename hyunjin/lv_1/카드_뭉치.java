public class 카드_뭉치 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++) {
            String target = goal[i];
            if (cardIdx1 < cards1.length && target.equals(cards1[cardIdx1])) {
                cardIdx1 ++;
            } else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2])) {
                cardIdx2++;
            } else {
                answer = "No";
            }
        }

        return answer;
    }
}
