package Homework.Hw4;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CollectionUtils {

    public static double average(Collection<Integer> list){
        double sum = 0;
        for(Integer e : list){
            sum += e.doubleValue();
        }
        return sum / list.size();
    }

    public static int maxLength(Collection<String> list){
        int max=Integer.MIN_VALUE;

        for(String s : list){
            if(s.length()>max){
                max=s.length();
            }
        }
        return max;

    }

    public static boolean containsDuplicate(Collection<Integer> list){

        Set<Integer> set = new HashSet<>(list);

        return list.size()!= set.size();

    }


}
