package lv_0;

public class 숫자_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(123456, 7));
    }

    // indexOf()를 사용하는 방법 알아두기
    public static int solution(int num, int k) {
        int answer = -1;

        String str = String.valueOf(num);
        int[] numList = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            numList[i] = Character.getNumericValue(str.charAt(i));
        }

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}
