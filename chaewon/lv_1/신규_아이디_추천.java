package lv_1;

public class 신규_아이디_추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("~!@#$%&*()=+[{]}:?,<>/"));
        System.out.println(solution(".1."));
    }

    public static String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();

        // 2단계
        for (Character c : new_id.toCharArray()) {
            if (!(c >= 'a' && c <= 'z') &&
                    !(Character.isDigit(c)) &&
                    c != '-' && c != '_' && c != '.') {
                new_id = new_id.replace(c.toString(), "");
            }
        }

        // 3단계
        new_id = new_id.replaceAll("[.]{2,}", "."); // []로 .을 감싸주어야 함

        // 4단계
        // 문자열이 비어있는지 체크하지 않으면 비어있을 경우 오류 발생
        if (!new_id.isEmpty() && new_id.charAt(0) == '.') {
            new_id = new_id.substring(1);
        }
        if (!new_id.isEmpty() && new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5단계
        if (new_id.equals("")) new_id = "a";

        // 6, 7단계
        if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);
        } else if (new_id.length() <= 2) {
            while (new_id.length() < 3) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
        }

        // 6단계를 거치고 뒤에 마침표(.)가 붙을 경우 제거
        if (new_id.charAt(new_id.length() - 1) == '.') {
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        return new_id;
    }
}
