import java.util.ArrayList;

public class 배열_만들기_5 {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {

        ArrayList<Integer> answer = new ArrayList<Integer>();

        for(int i=0;i<intStrs.length;i++){
            int a = Integer.parseInt(intStrs[i].substring(s,s+l));
            if (a > k) answer.add(a);
        }

        return answer;
    }
}
