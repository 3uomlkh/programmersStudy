package lv_0;

public class 날짜_비교하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2021, 12, 28}, new int[] {2021, 12, 29}));
        System.out.println(solution(new int[] {1024, 10, 24}, new int[] {1024, 10, 24}));
    }

    public static int solution(int[] date1, int[] date2) {
        int answer = 0;

        if (date1[0] != date2[0]){
            return date1[0] < date2[0] ? 1 : 0;
        } else if (date1[1] != date2[1]) {
            return date1[1] < date2[1] ? 1 : 0;
        } else if (date1[2] != date2[2]) {
            return date1[2] < date2[2] ? 1 : 0;
        }

        return answer;
    }
}
