public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution("027778888"));
    }

    public static String solution(String phone_number) {
        String answer = "";
        String s = "";
        String t = "";

        s = phone_number.substring(0,phone_number.length()-4).replaceAll("[0-9]","*");
        t = phone_number.substring(phone_number.length()-4,phone_number.length());

        answer = s+t;

        return answer;
    }
}
