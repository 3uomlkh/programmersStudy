public class l로_만들기 {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();

        for (char ch : myString.toCharArray()) {
            if (ch < 'l') {
                sb.append('l');
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
