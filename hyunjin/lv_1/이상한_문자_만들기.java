public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        String answer = "";
        String[] a = s.split(" ", -1);
        String b ="";

        for(int i = 0; i<a.length; i++){
            b = a[i];
            for(int j =0; j<b.length(); j++){
                if(j%2 == 0){
                    answer += (b.charAt(j)+"").toUpperCase();
                } else{
                    answer += (b.charAt(j)+"").toLowerCase();
                }
            }
            if(a.length - 1 == i){
                break;
            } else{
                answer += " ";
            }
        }
        return answer;
    }
}
