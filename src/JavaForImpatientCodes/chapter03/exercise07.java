package JavaForImpatientCodes.chapter03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class exercise07 {
    public static void main(String[] arg){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Dani");
        strings.add("Fred");
        strings.add("Alex");
        strings.add("Casey");
        CheckIfSorted checker = new CheckIfSorted();
        luckySort(strings, checker);
        for(String s: strings){
            System.out.println(s);
        }
    }

    static void luckySort(ArrayList<String> strings, Comparator<String> comp){
        while(!CheckIfSorted.checkSorted(strings)){
            Collections.shuffle(strings);
        }
    }
}

class CheckIfSorted implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2) <= 0 ? 1 : 0;
    }
    static boolean checkSorted(ArrayList<String> strings){
        boolean flag = true;
        CheckIfSorted checker = new CheckIfSorted();
        for(int i = 0; i < strings.size()-1; i++) {
            for (int j = i + 1; j < strings.size(); j++) {
                flag = !(checker.compare(strings.get(i), strings.get(j)) == 1);
                if (flag == false)
                    break;
            }
        }
        return flag;
    }
}