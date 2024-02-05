package lv_0;

public class l로_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("abcdevwxyz"));
        System.out.println(solution("jjnnllkkmm"));
    }

    public static String solution(String myString) {
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) < 108) {
                myString = myString.replace(myString.charAt(i), 'l');
            }
        }
        return myString;
    }
}
