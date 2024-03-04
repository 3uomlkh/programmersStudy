public class 안전지대 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
    }

    public static int solution(int[][] board) {
        int answer = 0;

        //위험지대 표시할 새로운 배열
        int [][] newBoard =  new int [board.length][board[0].length];

        //지뢰 위치 찾기
        for(int i=0 ; i< board.length; i++){

            for(int j=0 ; j< board[i].length; j++){

                if(board[i][j]==1){

                    danger(i,j,newBoard);
                }
            }
        }

        answer = countDanger(newBoard);

        return answer;
    }

    //지뢰 + 위험 지역 표시
    static void danger(int i, int j, int[][] newBoard){

        int overX = newBoard.length;
        int overY = newBoard[0].length;

        newBoard[i][j] = 1;
        if(i > 0) newBoard[i-1][j] =1;
        if(i < overX-1) newBoard[i+1][j] =1;
        if(j < overY-1) newBoard[i][j+1] =1;
        if(j > 0) newBoard[i][j-1] =1;
        if(i > 0 && j>0) newBoard[i-1][j-1] =1;
        if(i < overX-1 && j>0) newBoard[i+1][j-1] =1;
        if(i > 0 && j<overY-1) newBoard[i-1][j+1] =1;
        if(i < overX-1 && j<overY-1) newBoard[i+1][j+1] =1;

    }
    //0 숫자세기
    static int countDanger(int[][] board){

        int count =0 ;
        for(int i=0 ; i< board.length; i++){

            for(int j=0 ; j< board[i].length; j++){

                if(board[i][j]==0){
                    count++;
                }
            }
        }

        return count;
    }
}
