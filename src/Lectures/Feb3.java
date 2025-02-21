package Lectures;

public class Feb3 {


    /*

    An abstract data type is a data type that is characterized by its operations instead of internal

    The operations of an abstrct type are classified as follows:
    - CREATORS : create new objects of the type. Takes in values of a type but not an object.
            Like List.Of(). List.Of creates a immutable list(cannot add remove elements)
    -PRODUCERS : also creates new objects of the type but requires one or more existing objects of the type as input
    (substring method of string is an example of a producers)
    -observers: take objects of a type and returns objects of a different type
    -mutators: modify objects like lists add() method

    For Example...
    The  List is an Interface so Arraylists and linkedlists provide the actual implementation of the methods in the interface.
    Creators - new ArrayList(), List.Of()
    Producers - sublist
    observers - size, get
    mutators, add remove set sort

    For the String class
    Creators - String constructors, valueOf static methods, String literals like "abc"
    Producers - concat, substring, toUpperCase
    Observers - charAt, length
    Mutators, none(String objects are immutable)

    Coding to the Interface:
    Example - List<String> list = new ArrayList<>();
    This ensures we only call list methods and not methods specific to Arraylist.
    This makes it possible later to switch to another implementation of list such as Linkedlist





















     */


}
