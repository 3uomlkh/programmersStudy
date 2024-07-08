package lv_2;

import java.util.*;

public class 뉴스_클러스터링 {
    public static void main(String[] args) {
        System.out.println(solution("FRANCE", "french"));
    }

    public static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            String sub = str1.substring(i, i + 2);
            if (isAlphabet(sub)) {
                list1.add(sub);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            String sub = str2.substring(i, i + 2);
            if (isAlphabet(sub)) {
                list2.add(sub);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        int intersection = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    intersection++;
                    list1.set(i, " ");
                    list2.set(j, " ");
                }
            }
        }

        int union = (list1.size() + list2.size()) - intersection;
        double jakard;
        if (union == 0) {
            jakard = 1;
        } else {
            jakard = (double) intersection / (double) union;
        }

        return (int)(jakard * 65536);
    }

    private static boolean isAlphabet(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')) {
                return false;
            }
        }
        return true;
    }
}
