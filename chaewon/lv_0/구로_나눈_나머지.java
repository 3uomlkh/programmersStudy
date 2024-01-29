package lv_0;

public class 구로_나눈_나머지 {
    public static void main(String[] args) {
        System.out.println(solution("123"));
        System.out.println(solution("78720646226947352489"));
    }

    public static int solution(String number) {
        int sum = 0;

        // Integer.parseInt()를 쓰는 string과 달리 char형을 int로 바꿀 때는 getNumericValue()를 사용!
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }

        return sum % 9;
    }
}
