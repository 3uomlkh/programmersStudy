package lv_0;

public class 칠의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {7, 77, 17}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        for (int i = 0; i < sb.toString().length(); i++) {
            if (sb.toString().charAt(i) == '7') answer++;
        }

        return answer;
    }
}
