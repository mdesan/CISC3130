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




    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(5);
//        list.add(1);
        list.add(8);
        list.add(33);

        System.out.println(isSorted(list));

    }


}
