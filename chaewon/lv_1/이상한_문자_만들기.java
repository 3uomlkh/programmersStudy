package lv_1;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1); // 그냥 split(" ")으로 나누면 앞뒤 공백 까지 다 사라짐, 앞뒤 공백 유지를 위해 -1 추가

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (j % 2 == 0) answer.append(Character.toUpperCase(arr[i].charAt(j)));
                else answer.append(Character.toLowerCase(arr[i].charAt(j)));
            }
            if (i != arr.length - 1) answer.append(" ");
        }
        return answer.toString();
    }
}
