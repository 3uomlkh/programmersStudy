package lv_2;

public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        System.out.println(solution("-1 -2 -3 -4"));
        System.out.println(solution("-1 -1"));
    }

    public static String solution(String s) {
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return min + " " + max;
    }
}
