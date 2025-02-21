package Homework.Hw3;

import java.util.List;
import java.util.Objects;

public class Main {

    //1
    public static <E> int count(E[] arr, E e){

     int count =0;

        for (E value : arr) {
            if (Objects.equals(value, e)) {
                count++;
            }
        }
    return count;
    }

    //2
    public static <E extends Comparable<E>>  E max(E[] arr){
        if(arr.length==0){
            throw new IllegalArgumentException();
        }
        E currentMax =arr[0];

        for(int i =1; i<arr.length;i++){
            if(currentMax.compareTo(arr[i])<0){
                currentMax=arr[i];
            }
        }
        return currentMax;
    }

    //3
    public static  double average(List<? extends Number> list){
        double sum=0;

        for(int i =0;i<list.size();i++){
            sum += list.get(i).doubleValue();
        }

        return (sum/list.size());

    }



}

//3
