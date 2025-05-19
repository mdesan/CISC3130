package Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CodeWithSets {

    public static Integer maxLength(Set<String> set){

        if(set.isEmpty()){
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for(String s : set){
            if(s.length()>max){
                max=s.length();
            }
        }
        return max;
    }

    //because this problem only cares about whether the number appears in both(not how many times it appears),
    //we could just put both lists as a set to remove unecessary duplicates.
    public static int numInCommon(List<Integer> l1, List<Integer> l2){

        Set<Integer> set1 = new HashSet<>(l1);
        Set<Integer> set2 = new HashSet<>(l2);

        int count=0;

        if(set1.size()< set2.size()){
            for(int num : set1){
                if(set2.contains(num)){
                    count++;
                }
            }
        }
        else{
            for(int num : set2){
                if(set1.contains(num)){
                    count++;
                }
            }
        }
        return count;

    }

    public static int numUniqueValues(List<Integer> l){
        Set<Integer> set = new HashSet<>(l);
        return  set.size();
    }

    //use LinkedHashSet to maintain insertion order
    public static void removeDuplicates(List<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    public static Set<Integer> unionSets(Set<Set<Integer>> setOfSets){
        Set<Integer> union = new HashSet<>();

        for(Set<Integer> s : setOfSets){
            for(Integer num : s){
                union.add(num);
            }
        }
        return union;

    }

    public static int wordCount(String fileName) throws FileNotFoundException {
        Set<String> set = new HashSet<>();
        Scanner sc = new Scanner(new File(fileName));

        while(sc.hasNextLine()){
            set.add(sc.next());
        }

        sc.close();
        return set.size();
    }








}
