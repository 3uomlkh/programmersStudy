public class 신규_아이디_추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"	));
        System.out.println(solution("z-+.^."	));
        System.out.println(solution("=.="	));
        System.out.println(solution("123_.def"	));
    }

    public static String solution(String new_id) {
        String answer = "";

        String recoID = new_id.toLowerCase();

        recoID = recoID.replaceAll("[^a-z0-9_.-]", "");
        recoID = recoID.replaceAll("\\.{2,}", ".");
        recoID = recoID.replaceAll("^\\.|\\.$", "");

        if (recoID.length() == 0) {
            recoID = "a";
        } else if (recoID.length() > 15) {
            recoID = recoID.substring(0, 15);
        }

        recoID = recoID.replaceAll("\\.$", "");

        if (recoID.length() < 3) {
            String last = recoID.substring(recoID.length() - 1);
            while (recoID.length() < 3) {
                recoID += last;
            }
        }

        answer = recoID;

        return answer;
    }
}
