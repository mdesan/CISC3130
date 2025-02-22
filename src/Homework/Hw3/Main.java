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
    // remember that
    /*
    static void m(List<SomeType> list) {
        only a List<SomeType> or ArrayList<SomeType> etc. can be passed to this method.
        but a List<AnotherType> cannot be, even if AnotherType extends SomeType
        *** List<Dog> is not a List<Animal> ***
        Use List<T> when you want only a specific type.
}

static void m(List<?> list) {
    can be passed a List of any type, or an ArrayList of any type, etc.
    similar to a generic method, but doesn't define a type parameter.
    *** remember that ? means any type so you can pass a list of any type ***
    *** However you cannot ADD elements (except null) inside because java doesnt know what type it is  ***

}

        static void m(List<? extends SomeType> list) {
            can be passed a List<SomeType> or a List<AnotherType>,
            where AnotherType inherits from SomeType
            ***cannot add elements except null inside the method bc java doesnt which specific subclass it is***
}

static void m(List<? super SomeType> list) {
    can be passed a List<SomeType> or a List<AnotherType>,
     where AnotherType is a supertype of SomeType, that is,
     SomeType inherits from AnotherType

}
     */
    public static  double average(List<? extends Number> list){

        if(list.isEmpty()){
            throw new IllegalArgumentException();
        }

        double sum=0;

        for (Number number : list) {
            sum += number.doubleValue();
        }

        return (sum/list.size());

    }

    //4
    public static void replaceWithOnes(List<? super Integer> list){
        for(int i =0;i<list.size();i++){
            list.set(i, 1);
        }
    }

    //5
    public static <T extends Comparable<T>> boolean isSorted(T[]  list){
        for(int i =1;i<list.length;i++){
            if(list[i].compareTo(list[i-1])<0){
                return false;
            }
        }
        return true;
    }

    //6
    public static <T extends Comparable<T>> int binarySearch(T[] list, T item){

        int low =0;
        int high = list.length-1;


        while(low<=high) {
            int mid = (high + low)/2;
            if (item.compareTo(list[mid]) == 0 ) {
                return mid;
            } else if (item.compareTo(list[mid]) < 0) {
                high = mid -1;

            } else if (item.compareTo(list[mid]) > 0) {
                low = mid+1;

            }

        }
        return -1;

    }

    public static void main(String[] args){
        Integer[] list = new Integer[8];
        list[0]=3;
        list[1]=4;
        list[2]=7;
        list[3]=9;
        list[4]=14;
        list[5]=15;
        list[6]=27;
        list[7]=77;
        System.out.println(binarySearch(list, 14));

    }




}

