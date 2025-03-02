package Homework.Hw5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static String concatenate(List<?> list){
        List<?> subList = list.subList(0, list.size());

        if(!list.isEmpty()){
            return String.valueOf(list.getFirst());
        }

    }
    public static boolean contain(List<?> list, Object o){

    }
    public static boolean containsDuplicate(List<?> list){

    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(concatenate(list));
    }


}
