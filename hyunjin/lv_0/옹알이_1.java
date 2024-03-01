public class 옹알이_1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
        System.out.println(solution(new String[]{"ayaye", "uuuma", "ye", "yemawoo", "ayaa"}));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};

        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length; j++){
                babbling[i] = babbling[i].replace(str[j], " ");
            }

            if(babbling[i].trim().length() == 0){
                answer++;
            }
        }

        return answer;
    }
}
