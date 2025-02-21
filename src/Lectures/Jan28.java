package Lectures;

public class Jan28 {



    //first week of class. 3115 review

    //1. when overriding an equals method, make sure the parameter is Object to match the parameter in the Object class
    //2. Cant cast the Object to the correct class unless its an instanceOf. So check if its an instance of
    //3. we need to override the hashcode method as well.
    //-- if two objects are to be equal to eachther according to the equals method, then their hashcodes must be the same.
    //-- if o1.equals(o2) then o1.hashcode() == o2.hashcode() must be true

    /*
    @Override
    public int hashcode(){
        int result = Objects.hash(fieldOne, fieldTwo);
        return result;
    }
    */

    //Comparable review
    /*
    String compareTo method "a".compareTo("r") return a negative int because r is less than a (going backward)
     String compareTo method "r".compareTo("a") return a postive int because (going forward or to the left)

     Collections.sort(object) can only work if the objects class implements Comparable interface.
     - make sure to override the compareto method ( if u implement this interface you have to override all methods)

      Comparable is generic interface so make sure to add <> with the  type inside
      only has one method compareTo
      - all methods in an interface is abstract. but can make a nonabstract method in an interface by using
      the keyword default
      - can also make a static method in an interface.
      - overriding is only a

      best way to compare two ints:

      int result = Integer.compare(this.o, other.o);
      return result;

      Can use .sort method only if the class implements Comparable<>.

      compares objects using the "natural order"

     */

    //Comparator review (review this today read his code)
    /*
        Used if you want to compare objects in a different way besides the natural order.
        Have to Implement Comparator<>.
        - have to implement the compare method AND OVERRIDE THE COMPARE METHOD

        return Integer.compare(s1.length, s2.length)

        For this we have to write a little class
       -  class StudentAgeComparator implements Comparator<
       - class

        to sort in reverse order you have to make a new comparator and use the .reversed();
        Comparator <Student> byAge = new
        Comparator <Student> byAgeReversed = byAge.reversed();

        can also use .reverseOrder() method


        ***For comparator, we can also write it as a anonymous class, but we are only interested in making a single object of that class.***
        -anonymus class defines the body of a class AND creates an object
        - anonymous class is a very common way to create a comparator

        Animal feline = new Animal(){

        @Override
        public St

        }


        Comparator<String> byLength = new Comparator<>(){

        @Override
        }




     */

    //Comparable vs Comparator
    /*
    Comparable compares itself to another object


    vararg parameters (varies arguments

    public static double sum(double ... nums){ // treats just like an array and can also pass in an array

        double sum =0;

        for(double num : nums){

        sum += num;
    }

        return sum;
    }

    }

    List.of(1,2,3) returns an object of list, therefore it is a static factory method.
    -List.of creates an unmodifible list(not able to change the list using add() or get() etc.
    A static factory method returns an object of the class. like List.Of()

    (end of prereqs)

     */







}
