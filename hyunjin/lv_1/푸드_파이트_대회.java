public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6}));
        System.out.println(solution(new int[]{1, 7, 1, 2}));
    }

    public static String solution(int[] food) {
        String answer = "";
        StringBuffer left = new StringBuffer();
        StringBuffer right = new StringBuffer();

        for(int i = 1 ; i < food.length; i++){
            if(food[i] % 2 !=0){
                food[i] -= 1;
            }
        }
        for(int i = 1; i < food.length; i++){
            int number = food[i] / 2;
            while(number != 0){
                left.append(i);
                number--;
            }
        }
        String value = left.toString();
        for(int i = value.length() -1; i >= 0; i--){
            right.append(value.charAt(i));
        }
        answer += left;
        answer += "0";
        answer += right;
        return answer;
    }
}
