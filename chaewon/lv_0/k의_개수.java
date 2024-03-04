package lv_0;

public class k의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;

        String[] strArr = new String[(j - i) + 1];
        int index = 0;

        for (int l = i; l <= j; l++) {
            strArr[index++] = String.valueOf(l);
        }

        for (String str : strArr) {
            for (int t = 0; t < str.length(); t++) {
                char c = str.charAt(t);
                if (c == Character.forDigit(k, 10)) answer++;
            }
        }

        return answer;
    }

}
