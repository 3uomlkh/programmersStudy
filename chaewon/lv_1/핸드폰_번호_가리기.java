package lv_1;

public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
    }

    public static String solution(String phone_number) {
        String asterisk = "*";
        asterisk = asterisk.repeat(phone_number.length() - 4);
        phone_number = phone_number.substring(phone_number.length() - 4, phone_number.length());
        return asterisk + phone_number;
    }
}
