import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 괄호_회전하기 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));
    }

    public static int solution(String s) {
        int answer = 0;

        Queue<String> queue = new LinkedList<>();

        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i,i+1);
            queue.add(str);
        }

        for(int i = 0; i < s.length(); i++){
            String firstStr = queue.poll();
            queue.add(firstStr);

            Stack<String> stack = new Stack<>();

            for(int j = 0; j < s.length(); j++){
                String waitingStr = queue.poll();
                queue.add(waitingStr);

                if(stack.isEmpty()){
                    stack.push(waitingStr);
                }
                else if(waitingStr.equals(")") && stack.peek().equals("(")){
                    stack.pop();
                }
                else if(waitingStr.equals("]") && stack.peek().equals("[")){
                    stack.pop();
                }
                else if(waitingStr.equals("}") && stack.peek().equals("{")){
                    stack.pop();
                }
                else{
                    stack.push(waitingStr);
                }
            }

            if(stack.isEmpty()){
                answer++;
            }
        }
        return answer;
    }
}
