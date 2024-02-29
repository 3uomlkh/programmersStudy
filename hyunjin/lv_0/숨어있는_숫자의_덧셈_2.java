public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        int answer = 0;
        String[] str = my_string.replaceAll("[a-zA-Z]"," ").split(" ");

        for(String s :  str){
            if(!s.equals("")){
                answer+=Integer.valueOf(s);
            }
        }
        return answer;
    }
}
