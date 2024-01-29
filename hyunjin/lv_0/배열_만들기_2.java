import java.util.ArrayList;
import java.util.List;

public class 배열_만들기_2 {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String a = Integer.toString(i);
            String[] arr = a.split("");
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("5") || arr[j].equals("0")) {
                    count++;
                }
            }
            if(count == arr.length) {
                list.add(i);
            }
        }
        if(list.isEmpty()) list.add(-1);
        return list.stream().mapToInt(i->i).toArray();
    }
}
