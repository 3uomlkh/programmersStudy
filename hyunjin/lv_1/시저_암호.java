public class 시저_암호 {
    public static void main(String[] args) {
        System.out.println(solution("AB", 1));
        System.out.println(solution("z", 1));
        System.out.println(solution("a B z", 4));
    }

    public static String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch+n-'a')%26);
            }else {
                answer += (char)('A' + (ch+n-'A')%26);
            }
        }
        return answer;
    }
}
