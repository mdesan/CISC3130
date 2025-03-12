package Homework.Hw5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    //1
    public static String concatenate(List<?> list){

        if(list.isEmpty()){
            return "";
        }
        return list.get(0) + concatenate(list.subList(1, list.size()));


    }

    //2
    public static boolean contains(List<?> list, Object o){

     if(list.isEmpty()){
         return false;
     }

     if(Objects.equals(o, list.get(0))){
         return true;
     }
     List<?> subList = list.subList(1,list.size());
     return contains(subList, o);

    }

    //3
    public static boolean containsDuplicate(List<?> list){
        if(list.size()<=1){
            return false;
        }

       List<?> sublist = list.subList(1, list.size());

        if(contains(sublist, list.getFirst())){
            return true;
        }
        return containsDuplicate(sublist);

    }


    //4
    public static boolean containsConsecutiveDuplicate(List<?> list){

        if(list.isEmpty() || list.size()==1){
            return false;
        }

        Object first = list.get(0);
        List<?> subList = list.subList(1, list.size());

        if(Objects.equals(first, subList.get(0))){
            return true;
        }

        return containsConsecutiveDuplicate(subList);
    }

    public static <E extends Comparable<E>> boolean isSorted(List<E> list){
        if(list.size()<=1){
            return true;
        }
        List<E> subList = list.subList(1, list.size());

        if(list.get(0).compareTo(subList.get(0))>0){
            return false;
        }
        return isSorted(subList);
    }

    
    public static boolean equals(List<?> list1, List<?> list2){
        if(list1.isEmpty() && list2.isEmpty() ){
            return true;
        }
        if(list1.size() != list2.size()){
            return false;
        }

        List<?> sub1 = list1.subList(1, list1.size());
        List<?> sub2 = list2.subList(1, list2.size());

        if(Objects.equals(list1.get(0), list2.get(0))){
            return equals(sub1, sub2);
        }
        return false;
    }

    //optional (for this one try to fix triple consecutive)
//    public static void removeConsecutiveDuplicates(List<?> list){
//
//
//        if(list.size()>1){
//            List<?> subList ;
//            if(Objects.equals(list.get(0),list.get(1))){
//                list.remove(0);
//                subList = list.subList(0, list.size());
//            }
//            else{
//                subList = list.subList(1, list.size());
//            }
//
//            removeConsecutiveDuplicates(subList);
//        }
//    }
    public static void removeConsecutiveDuplicates(List<?> list) {
        if (list.size() > 1) {
            if (Objects.equals(list.get(0), list.get(1))) {
                list.removeFirst();
            }

            removeConsecutiveDuplicates(list.subList(1, list.size()));
        }
    }

    //Optional . can use addFirst(E element) method
    public static <E> List<E> withConsecutiveDuplicatesRemoved(List<E> list){



    }





    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(4);







        System.out.println(list);
        removeConsecutiveDuplicates(list);
        System.out.println(list);

    }


}
