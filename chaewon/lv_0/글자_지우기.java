package lv_0;

public class 글자_지우기 {
    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }

    // 답 보고 푼 문제 - StringBuilder 활용, subString으로 푸니 정확도가 80이 나옴
    public static String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            boolean isInclude = false;
            for (int indice : indices) {
                if (indice == i) {
                    isInclude = true;
                    break;
                }
            }
            if (!isInclude) {
                sb.append(my_string.charAt(i));
            }
        }

        return sb.toString();
    }
}
