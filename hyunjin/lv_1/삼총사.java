public class 삼총사 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(solution(new int[]{-1, 1, -1, 1}));
    }

    public static int dfs(int start, int len, int count, int []number, int sum, int[] temp){
        if(count == 2) {
            if (sum == 0) {
                temp[0]++;
                return 1;
            }
            return 0;
        }
        for (int i = start; i < len; i++) {
            int sum_dfs = sum;
            sum_dfs += number[i];
            dfs(i + 1, len, count + 1, number, sum_dfs, temp);
        }
        return 0;
    }

    public static int solution(int[] number) {
        int [] temp = {0};
        int answer=0;
        int len = number.length;
        int result = 0;

        for (int i = 0; i < len; i++) {
            dfs(i+1, len, 0, number, number[i], temp);
        }

        return temp[0];
    }
}
