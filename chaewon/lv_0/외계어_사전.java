package lv_0;

public class 외계어_사전 {
    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }

    public static int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (String d : dic) {
            int cnt = 0;
            for (String s : spell) {
                if (d.contains(s)) cnt++;
            }
            if (cnt == spell.length) {
                answer = 1;
                break;
            }
        }

        return answer;
    }

}
