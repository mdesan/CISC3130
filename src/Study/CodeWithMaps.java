package Study;
import java.util.*;

public class CodeWithMaps {

//    public static void CountNames(String[] args){
//
//        Scanner sc = new Scanner(System.in);
//        Map<String, Integer> map = new HashMap<>();
//        System.out.println("Enter name: ");
//        String name = sc.nextLine();
//        while(!name.isEmpty()){
//            if(map.containsKey(name)){
//                map.put(name, map.get(name)+1);
//            }
//            else{
//                map.put(name,1);
//            }
//            System.out.println("Enter name: ");
//            name=sc.nextLine();
//        }
//
//        for(String key : map.keySet()){
//            System.out.println("Entry [" + arg + "] has count " + map.get(arg) );
//        }
//    }

    //set should be the key, list should be value
    public static Map<Integer,Integer> count(List<Integer> list, Set<Integer> set){
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer num : set){
            map.put(num,0);
            for(int i =0;i<list.size();i++){
                if(Objects.equals(num,list.get(i))){
                    map.put(num,map.get(num)+1);
                }
            }
        }
        return map;

    }

    public static boolean hasDuplicateValue(Map<String, String> map){
            if(map.isEmpty() || map.size()==1){
                return false;
            }

           Set<String> set = new HashSet<>(map.values());

            if(map.size()> set.size()){
                return true;
            }
            else{
                return false;
            }
    }

    public static boolean hasThree(List<String> list){
        Map<String, Integer> map = new HashMap<>();

        for(String s : list){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s,1);
            }
        }

        for(String s: list){
            if(map.get(s)==3){
                return true;
            }
        }
        return false;

    }

    public static boolean uniqueOccurences(int [] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        Set<Integer> set = new HashSet<>(map.values());

        if(map.size()> set.size()){
            return false;
        }
        else{
            return true;
        }

    }

    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }

        int sum =0;

        for(Integer num : nums){
            if(map.get(num)==1){
                sum+=num;
            }
        }
        return sum;

    }

    public static int frequencyCount(Collection<String> collection, int frequency) {

        int count =0;

        Map<String, Integer> map = new HashMap<>();

        //this loop creates the map
        for(String s: collection){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else {
                map.put(s,1);
            }
        }

        for(String s: map.keySet()){
            if(map.get(s)==frequency){
                count++;
            }
        }

        return count;

    }

    public static int maxFrequency(Collection<String> collection) {
        Map<String, Integer> map = new HashMap<>();

        for(String s: collection){
            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            }
            else{
                map.put(s, 1);
            }
        }

        int max=0;

        for(Integer freq: map.values()){
            if(freq>max){
                max=freq;
            }
        }
        return max;

    }

//    public static boolean containsDuplicateII(int[] nums,int k){
//
//    }













}
