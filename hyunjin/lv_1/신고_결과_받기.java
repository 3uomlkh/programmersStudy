import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 신고_결과_받기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}, 2)));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {

    int[] answer = new int[id_list.length];
    ArrayList<String> list = new ArrayList<>();

    Map<String, Integer> rpmap = new HashMap<>();
    Arrays.stream(report).distinct().forEach((rp) -> {
        String rplist[] = rp.split(" ");
        int cnt = 1;
        if(rpmap.containsKey(rplist[1]))
            cnt = rpmap.get(rplist[1])+1;
        rpmap.put(rplist[1],cnt);
        list.add(rp);
    });

    for(String li:list) {
        String[] liarr = li.split(" ");

        if(rpmap.get(liarr[1]) >= k)
            answer[Arrays.asList(id_list).indexOf(liarr[0])]++;
    }
    return answer;
}
}
