import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class 접두사인지_확인하기 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];

        for (int i=0; i<my_string.length(); i++) {
            arr[i] = my_string.substring(0, i+1);
        }

        List<String> strList = new ArrayList<>(Arrays.asList(arr));

        if (strList.contains(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }

        return answer;
    }
}
