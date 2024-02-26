import java.util.Arrays;

public class _7의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17}));
        System.out.println(solution(new int[]{10, 29}));
    }

    public static int solution(int[] array) {
        int answer = 0;
        String str = Arrays.toString(array);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '7'){
                answer++;
            }
        }

        return answer;
    }
}
