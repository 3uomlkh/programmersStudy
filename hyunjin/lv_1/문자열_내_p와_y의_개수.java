public class 문자열_내_p와_y의_개수 {
    public static void main(String[] args) {
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("Pyy"));
    }

    static boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        s = s.toLowerCase();
        char[] c = s.toCharArray();

        for(char ch : c){
            if(ch=='p')
                pCount++;
            if(ch=='y')
                yCount++;
        }

        if (pCount == yCount) {
            answer = true;
        } else if  (pCount == 0 && yCount == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}
