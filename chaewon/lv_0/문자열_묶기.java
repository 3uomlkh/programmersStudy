package lv_0;

public class 문자열_묶기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"a","bc","d","efg","hi"}));
    }

    public static int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[30];

        for (int i = 0; i < strArr.length; i++) {
            arr[strArr[i].length() - 1]++;
        }

        for (int i : arr) {
            if (answer < i) answer = i;
        }

        return answer;
    }
}
