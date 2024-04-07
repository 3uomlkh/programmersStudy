import java.util.Stack;

public class 크레인_인형뽑기_게임 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[]{1,5,3,5,1,2,1,4}));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        int len = board[0].length;
        Stack<Integer> st = new Stack<>();

        for(int mv:moves){
            mv -=1;
            for(int i=0; i<len; i++){
                if(board[i][mv] != 0){
                    if(st.size() > 0  && st.peek() == board[i][mv] ){
                        st.pop();
                        answer += 2;
                    }else{
                        st.push(board[i][mv]);
                    }
                    board[i][mv] = 0;
                    break;
                }
            }
        }
        return answer;
    }

}
