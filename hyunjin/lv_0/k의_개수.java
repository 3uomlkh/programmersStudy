public class k의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";

        for(int a = i; a <= j ; a++) { str += Integer.toString(a); }

        String[] check = str.split("");

        for(int idx = 0; idx < check.length; idx++){
            if(check[idx].equals(Integer.toString(k))) answer++;
        }

        return answer;
    }
}
