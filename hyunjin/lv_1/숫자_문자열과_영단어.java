public class 숫자_문자열과_영단어 {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        for(int i = 0; i < 10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        answer = Integer.parseInt(s);
        return answer;
    }
}
