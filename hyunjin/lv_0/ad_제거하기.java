import java.util.ArrayList;
import java.util.List;

public class ad_제거하기 {
    public String[] solution(String[] strArr) {
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < strArr.length; i++) {
            if(!strArr[i].contains("ad")) {
                answer.add(strArr[i]);
            }
        }

        return answer.toArray(new String[0]);
    }
}
