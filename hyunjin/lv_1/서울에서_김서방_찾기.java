public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        String answer = "";
        int result = 0;

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                result = i;
                break;
            }
        }

        answer = "김서방은 " + String.valueOf(result) + "에 있다";

        return answer;
    }
}
