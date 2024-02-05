public class A_강조하기 {
    public String solution(String myString) {
        String answer = "";

        for (int i=0; i<myString.length(); i++) {
            answer = myString.toLowerCase();
        }

        return answer.replace("a", "A");
    }
}
