import java.util.Stack;

public class 햄버거_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
        System.out.println(solution(new int[]{1, 3, 2, 1, 2, 1, 3, 1, 2}));
    }

    public static int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ingredient.length; i++) {

            st.push(ingredient[i]);

            if(st.size() >= 4) {
                if (st.get(st.size() - 1) == 1 && st.get(st.size() - 2) == 3 && st.get(st.size() - 3) == 2 && st.get(st.size() - 4) == 1) {

                    answer++;
                    st.pop();
                    st.pop();
                    st.pop();
                    st.pop();
                }
            }

        }

        return answer;
    }
}
