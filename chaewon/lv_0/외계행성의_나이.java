package lv_0;

public class 외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }

    public static String solution(int age) {
        StringBuilder answer = new StringBuilder();
        String strAge = String.valueOf(age);
        int[] letters = new int[122];
        int index = 0;

        for (int i = 97; i < 122; i++) {
            letters[index++] = i;
        }

        for (int i = 0; i < strAge.length(); i++) {
            int n = Character.getNumericValue(strAge.charAt(i));

            char letter = (char) letters[n];
            answer.append(letter);
        }

        return answer.toString();
    }
}
