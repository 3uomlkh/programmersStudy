public class 크기가_작은_부분_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("3141592", "271"));
        System.out.println(solution("500220839878", "7"));
        System.out.println(solution("10203", "15"));
    }

    public static int solution(String t, String p) {
        int answer = 0;

        int len = p.length();
        for(int i=0 ; i<=t.length()-len ; i++){
            String test = t.substring(i,i+len);
            if(Long.parseLong(test) <= Long.parseLong(p)){
                answer ++;
            }
        }

        return answer;
    }
}
