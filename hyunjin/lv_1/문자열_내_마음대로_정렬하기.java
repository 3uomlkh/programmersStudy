import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"sun", "bed", "car"}, 1)));
    }

    public static String[] solution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        if (o1.charAt(n) > o2.charAt(n)) {
                            return 50;
                        } else if (o1.charAt(n) < o2.charAt(n)) {
                            return -50;
                        } else if (o1.charAt(n) == o2.charAt(n)) {
                            return o1.compareTo(o2);
                        }
                        return 0;
                    }
                }
        );
        return strings;
    }
}
