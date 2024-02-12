public class 외계행성의_나이 {
    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution(51));
        System.out.println(solution(100));
    }
    public static String solution(int age) {
        String answer = "";
        String temp = Integer.toString(age);
        for (int i = 0; i < temp.length(); i++) {
            answer += (char) ((char) temp.charAt(i) + 49);
        }
        return answer;
    }
}
