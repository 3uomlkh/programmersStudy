public class 특정_문자열로_끝나는_가장_긴_부분_문자열_찾기 {
    public String solution( String myString, String pat ) {
        int count = 0;
        String result = "";

        for ( int i = 0; i < myString.length( ); i++ ) {
            if (myString.substring(i).contains(pat)) {
                count++;
            }
        }

        result = myString.substring(0, count + pat.length() - 1);

        return result;
    }
}
