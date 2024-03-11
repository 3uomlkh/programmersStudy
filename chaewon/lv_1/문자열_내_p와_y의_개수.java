package lv_1;

public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("pYy"));
    }

    public static boolean solution(String str) {
        boolean answer = true;
        StringBuilder sb = new StringBuilder();

        // 아래와 같이 문자 하나하나 바꾸지 않아도 str.toUpperCase()로 한 번에 바꿀 수 있었다.
        for (char s : str.toCharArray()) {
            sb.append(Character.toLowerCase(s));
        }

        String newStr = sb.toString();
        // p와 y의 개수를 저장하는 변수로 풀 수도 있지만, count라는 변수 하나만을 사용해서 푼 정답도 있었다.
        // count 변수를 정의한 후 p일 때는 1씩 증가, y일 때는 1씩 감소해서 count가 0이 아닐 때 false를 return 하는 것!
        int p = 0;
        int y = 0;

        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == 'p') p++;
            else if (newStr.charAt(i) == 'y') y++;
        }

        if (p != y) answer = false;

        return answer;
    }
}
