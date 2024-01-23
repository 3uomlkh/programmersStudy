import java.util.ArrayList;

public class 배열_만들기_4 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 4, 2, 5, 3}));
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
            } else {
                if (stk.get(stk.size() - 1) < arr[i]) {
                    stk.add(arr[i]);
                } else if (stk.get(stk.size() - 1) >= arr[i]) {
                    stk.remove(stk.get(stk.size() - 1));
                    i--;
                }
            }
        }

        return stk;
    }
}
