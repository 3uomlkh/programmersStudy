import java.util.*;

public class 뉴스_클러스터링 {

    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
    }

    public static int solution(String str1, String str2) {
        ArrayList<String> set1 = makeSet(str1.toLowerCase());
        ArrayList<String> set2 = makeSet(str2.toLowerCase());
        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> inter = new ArrayList<>();

        if (set1.size() == 0 && set2.size() == 0) return 65536;

        for (String e : set1) {
            if (set2.remove(e)) inter.add(e);
        }
        union.addAll(set1);
        union.addAll(set2);
        double similar = (double)inter.size() / (union.size() == 0? 1 : union.size());
        return (int)(similar*65536);
    }

    public static ArrayList<String> makeSet(String str) {
        ArrayList<String> set = new ArrayList<>();
        for (int i = 1; i < str.length(); i++){
            String e = str.substring(i-1,i+1);
            if (e.charAt(0) < 97 || e.charAt(0) > 122) continue;
            if (e.charAt(1) < 97 || e.charAt(1) > 122) continue;
            set.add(e);
        }
        return set;
    }
}
