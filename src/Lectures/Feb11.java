package Lectures;

public class Feb11 {

    /*
        ****GENERICS****
    - May want to make a Pair class that returns a pair of something (a pair of ints or doubles or string or students)
    * doesn't make sense to write a StringPair DoublePair StudentPair classes
    public class Pair<T>
    * Pair pair = new Pair(3,45); ---> legal but not a good idea

    items = new T(0) is not allowed
    you have to do  --- items = (T[]) new Object[2]


    * public class NumberPair<T extends Number> ----> use if only want the pairs to be a direct or indirect class of Number
    NumberPair<Double> = new NumberPair<Double>(2.1, 3.5)

    public static <E> E middle (E[] arr){  ----> this is a generic method. Used if you want to return different types.
    }

    public static <E> void swap(List<E> list, int index1, int index2){

     }

     public static <E extends Comparable<E> > E max(List<E list>{   ---> used

     }

     Arays are covarient -> if A is a subtype of B then A[] is a subtype of B[]

     But classes and interfaces are invarient -> if A is a subtype of B. List<A> is NOT a subtype of List<B>
      List<?> is the same as list of anyhting
      * cannot return a question mark(wildcard)
      *
      *
      *
      *
      public static void doSomething1(List<? extends Number> list){
      }
      public static double sum (List<? extends Number> list){
      }

      public static void doSomething2(List<? super Number> list){
      }    ---> Number and everything above it




      public void copyTo(Pair<? super T> destination){
        destination.first = this.first;
        destination.second = this.second;
      }
      *
      *
     ****  WHEN TO USE SUPER AND WHEN TO USE EXTENDS? PECS Producer - extends / Consumer - super ****

           */


}
//generic class T is a type parameter
class Pair<T>{
    private T first, second;

    private pair(T first, T second){
        this.first = first;
        this.second=second;
    }

}
