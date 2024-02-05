import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 문자열_잘라서_정렬하기 {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        Arrays.sort(answer);
        List<String> list = new ArrayList<>();

        for (String s : answer) {
            if(!s.equals("")) list.add(s);
        }

        return list.toArray(new String[list.size()]);
    }
}
