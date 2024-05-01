public class _1번_붕대_감기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 1, 5}, 30, new int[][]{{2, 10}, {9, 15}, {10, 5}, {11, 5}}));
        System.out.println(solution(new int[]{3, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
        System.out.println(solution(new int[]{4, 2, 7}, 20, new int[][]{{1, 15}, {5, 16}, {8, 6}}));
    }
    public static int solution(int[] bandage, int health, int[][] attacks) {
        // int answer = 0;
        int life = health;
        int attackIdx = 0;
        int heal = 0;

        for (int i = 1; i <= attacks[attacks.length-1][0]; i++){
            if (i != attacks[attackIdx][0]){
                life += bandage[1];
                heal++;
                if (heal == bandage[0]){
                    life += bandage[2];
                    heal = 0;
                }
                if (life > health) life = health;
            } else {
                heal = 0;
                life -= attacks[attackIdx][1];
                attackIdx++;
                if (life <= 0) return -1;
            }
        }
        return life;
        // return answer;
    }
}
