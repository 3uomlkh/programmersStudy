public class 문자_개수_세기 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for(int i=0; i<my_string.length(); i++) {
            if ((int)my_string.charAt(i) > 64 && (int)my_string.charAt(i) < 91) {
                answer[(int)my_string.charAt(i) - 65]++;
            } else if ((int)my_string.charAt(i) > 96 && (int)my_string.charAt(i) < 123) {
                answer[(int)my_string.charAt(i) - 97 + 26]++;
            }
        }

        return answer;
    }
}