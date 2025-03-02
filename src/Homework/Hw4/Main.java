package Homework.Hw4;

import java.util.*;

public class Main {

    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<>();
        myList.add("m");
        myList.add("d");
        myList.add("k");
        myList.add("n");
        myList.add("p");

    }

    //1
    public static void removeAll(List<String> v, String e) {
        Iterator<String> it = v.iterator();

        while(it.hasNext()){
            if(it.next().equals(e)){
                it.remove();
            }
        }


    }

    //2
    //remember to remove the element through the iterators remove method to avoid concurrentModification exception
    public static List<Integer> removeEvens(List<Integer> list1){
        Iterator<Integer> it = list1.iterator();
        List<Integer> list2 = new ArrayList<>();

        while(it.hasNext()){
            int i = it.next();
            if(i%2==0){
                list2.add(i);
                it.remove();
            }
        }
        return list2;
    }

    //3
    public static void removeDuplicates(ArrayList<String> list){
        Iterator<String> it = list.iterator();

        if(list.isEmpty()){
            return;
        }

        String last = it.next();
        while(it.hasNext()){
            String current = it.next();
            if(current.equals(last)){
                it.remove();
                last=current;
            }
        }

    }

    //4
    public static void removeEvenlength(Set<String> list){

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String s=it.next();
            if(s.length()%2==0){
                it.remove();
            }
        }
    }

    //5
    public static <E extends Comparable<E>> E max(Collection<E> list){
        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }
        Iterator<E> it = list.iterator();

        E max = it.next();

        while(it.hasNext()){
            E current = it.next();
            if(current.compareTo(max)>0){
                max=current;
            }
        }
        return max;
    }

    //6
    public static <E extends Comparable<E>> boolean isSorted(SequencedCollection<E> list){
        Iterator<E> it = list.iterator();

        E last = it.next();
        while(it.hasNext()){
            E current = it.next();
            if(current.compareTo(last)<0){
                return false;
            }
            last=current;
        }
        return true;
    }








}
