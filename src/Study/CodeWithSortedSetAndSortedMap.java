package Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CodeWithSortedSetAndSortedMap {

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("/home/mike/Desktop/families.txt");
        File file2 = new File("/home/mike/Desktop/buddies.txt");

        friendLists(file2);

    }

    public static void biggestFamily(File file) throws FileNotFoundException {
    }

    public static TreeMap<String, TreeSet<String>> friendLists(File file) throws FileNotFoundException {
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();

        Scanner sc = new Scanner(file);


        while(sc.hasNext()){
            String first = sc.next();
            String second = sc.next();

            //handle first person
            if(!map.containsKey(first)){
                map.put(first, new TreeSet<>());
            }
            map.get(first).add(second);

            //handle second person
            if (!map.containsKey(second)) {
                map.put(second, new TreeSet<>());
            }

            map.get(second).add(first);
        }
        sc.close();
        for(String name: map.keySet()){
            System.out.println(map.get(name));
        }
        return map;


    }

}
