package lv_0;

public class 수_조작하기_1 {
    public static void main(String[] args) {
        System.out.println(solution(0, "wsdawsdassw"));
    }

    public static int solution(int n, String control) {
        for (int i = 0; i < control.length(); i++) {
            switch(control.charAt(i)) {
                case 'w':
                    n++;
                    break;
                case 's':
                    n--;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -= 10;
                    break;
            }
        }

        return n;
    }
}
