package Homework.Hw4;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static String getInitials(List<String> list){
        StringBuilder initials = new StringBuilder();
        for(String s: list){
            initials.append(s.charAt(0));
        }

        return initials.toString();
    }

    public static void swapFirstAndLast(List<String> list){
        String temp = list.getFirst();

        list.set(0, list.get(list.size()-1));
        list.set(list.size()-1,temp);

    }

    public static List<Integer> firstN(List<Integer> list, int n ){
        List<Integer> newList = new ArrayList<>();
        for(int i =0;i<n;i++){
            newList.add(list.get(i));
        }
        return newList;
    }

    public static List<Integer> lastN(List<Integer> list, int n ){
        List<Integer> newList = new ArrayList<>();
        for(int i =list.size()-n; i<list.size(); i++){
            newList.add(list.get(i));
        }
        return newList;
    }

    public static boolean isSorted(List<Double> list){
        for(int i =1; i < list.size();i++){
            if(list.get(i)< list.get(i-1)){
                return false;
            }
        }
        return true;
    }

    public static void printSorted(List<String> list){
        String s = "";

       for(int i =0;i<list.size();i++ ){

       }
    }








}
