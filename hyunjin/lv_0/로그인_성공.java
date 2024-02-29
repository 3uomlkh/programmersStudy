public class 로그인_성공 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"}, new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"abc04", "345"}, new String[][]{{"abc04", "335"}, {"abc03", "345"}}));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "fail";

        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id_pw[0]) && db[i][1].equals(id_pw[1])) {
                answer = "login";
            } else if (db[i][0].equals(id_pw[0])) {
                answer = "wrong pw";
            }
        }

        return answer;
    }
}
