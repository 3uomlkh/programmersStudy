package lv_0;

public class A_강조하기 {
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
        System.out.println(solution("PrOgRaMmErS"));
    }

    public static String solution(String myString) {
        myString = myString.toLowerCase();
        StringBuilder sb = new StringBuilder(myString);

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'a') sb.setCharAt(i, 'A');
        }

        // replace 함수가 있었다는 사실을 까먹었다!
//        myString = myString.replace('a', 'A');

        return sb.toString();
    }
}
