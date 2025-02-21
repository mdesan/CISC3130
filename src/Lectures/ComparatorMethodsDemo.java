package Lectures;

import java.util.Comparator;

public class ComparatorMethodsDemo {

    Comparator<String> byLength = new Comparator<String>() {
        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    };

    Comparator<String> alphabetically = Comparator.naturalOrder();

    public static void main(String[] args){
        String a = "a";
        String b = "b";
        String c = "c";

        String mike = "mike";


        System.out.println(a.compareTo(b)); // compares a to b . Since b needs to go to the left(negative direction) to reach a, result is negative.

        System.out.println(b.compareTo(a)); //compares b to a. since a needs to go to the right(positive direction) to reach b, result is positive

        System.out.println(mike.compareTo(a)); // result is positive (comparing strings natural order is alphabetically so it compares by the first letter)
        // result is 12 because a to m is twelve

        System.out.println("make".compareTo(mike)); // negative

        Comparator<String> byLength = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Comparator<String> alphabetically = Comparator.naturalOrder();

        System.out.println(byLength.compare(a,b)); // result is 0 because they are the same length

    }

}
