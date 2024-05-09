import java.util.Arrays;

public class 이진_변화_반환하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
        System.out.println(Arrays.toString(solution("01110")));
        System.out.println(Arrays.toString(solution("1111111")));
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];

        String noZeroNum = "";

        while(!s.equals("1")) {
            answer[0]++;
            noZeroNum = s.replaceAll("0", "");
            answer[1] += s.length() - noZeroNum.length();
            s = Integer.toBinaryString(noZeroNum.length());
        }

        return answer;
    }
}
