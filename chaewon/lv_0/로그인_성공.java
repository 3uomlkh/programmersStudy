package lv_0;

public class 로그인_성공 {
    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String id = id_pw[0];
        String pw = id_pw[1];

        for(int i = 0; i < db.length; i++) {
            for (int j = 0; j < db[i].length; j++) {
                if (id.equals(db[i][0]) && pw.equals(db[i][1])) return "login";
                if (id.equals(db[i][0]) && !pw.equals(db[i][1])) return "wrong pw";
                if (!id.equals(db[i][0])) answer = "fail";
            }
        }

        return answer;
    }
}
