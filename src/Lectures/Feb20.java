package Lectures;

public class Feb20 {

    /*

    ##### JAVA COLLECTIONS FRAMEWORK #####

    Collection - a group of objects. no order (root interface in the collection hierachy)
        - (no class that directly implements the collection interface)
        Methods in Collection
            - size(), isEmpty(), contains(), toArray()

        Optional operations
            - Some methods of Collection are marked as optional
                List.of():  add remove, and set are optional because list.of creates a unmodifiable list
                add(E e) [optional operation, returns true if collection changed], remove() [optional; operation]
        Bulk operations
           - containsAll() (not checking a single element but a bulk of elements)
           - addAll(), removeAll()
           - retainAll(Collection<?> c ) (only wanna keep the elements that are in c)
           - clear() [bulk and Optional operation]


    Iterable ( an object whose elements can be successively retrieved)
        - a enhanced for loop works with this
        - has a method called Iterator<T> iterator()
            - returns an Iterator: an object that transveres a collection of elements and allows for their retireval
            one at a time.
            - some subtypes override this method for order
            - Iterator is an object that implements Iterable
                - has methods next(), hasNext, default void remove() [optional operation]

        //used to iterate through elements that do not have indexes
        for (Iterator<E> it = collection.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }
        System.out.println();


        public interface MySet<E> extends Iterable<E>{
        }

         SequencedCollection - a collection with a predictable order
         interface SequenceCollection<E> extends Collection<E>
          - it is a collection that has a well-defined encounter order
          - supports operations at both ends
          - and can produce its reversal
          - doesnt necessarily have indexes

          SequencedCollection<E> reversed() creates a reversed view of this
          reversed() changes to reveresedList affects original and vice versa
          reversed is in fact a list.



      View Collections
        -most collections manage storage for elements they contain
        - view collection do not store elements

        ####interface List<E> extends SequencedCollection<E>####

        List is an ordered collection where the user has precise control over where in the list each element is inserted.
        - the user can access elements by their intger index
        - lists typically allow duplicate elements


       List actaully overrides methods such as
        boolean add(E e)[optional operation]
        - appends element to the end of the list.
        boolean remove(Object o)[optional operation]
        - removes the FIRST occurence of the specified element from the list if it is present
            (collections remove method just says it removes the occurence)
       List<E> new methods
       get , set, remove(index)
       default void sort(Comparator<? super E> c) ---> Comparator<Number> c ... list.sort(c) works

       List<E> subList(int fromIndex, int toIndex)
        - returns a view of the portion of this list between the specified fromindex inclusive, and toIndex, exclusive

       - list.sublist(from, to).clear();
       this means that if you do
       List<Integer> sub = original.subList(1,3);
       sub.clear(); will affect the original list

       List<E> static factory methods

       static <E> List<E> of(E... elements)
       - returns an unmodifiable list containing the specified elements, in the order in which they are provided.

       static <E> List<E> copyOf(Collection<? extends E> coll)
       -returns an unmodifiable list containing the elements of the given collection in its iteration order.
       - * if the given Collecction is subsequently modified, the returned List will ot reflect such modifications.
       - so it stores its own data

       Unmodifiable Lists
       - List.Of and List.copyOf
            - cannot hold null elements
            - elements cannot be added removed or replaced

      #  Arrays.asLists method #
        - public static <T> List<T> asList(T...a)
            -returns a fixed size list backed by the specified array.
            - changes made to the array will be visible in the returned list, and changes made to the list will be visible in the array.
            - can set an element, but canot add an element


         ###Unmodifiable View Collections###
         - the effect is to provide read only acess to the backing collection
         - read only view(access but not modify)
         List<Integer> unmodifiableView = Collections.unmodifiableList(originalList); // cannot set or add with unmdifiableView.
            - doesnt copy elements (efficient) but offers a view.


        Collections class method: unmodifiable wrappers


        ####HOMEWORK 4#####

        //
        List<Integer> list = new ArrayList<>(List.of(5, 10, 15, 20, 25));
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        list.remove(2);
        list.set(2, 22);
        System.out.println(unmodifiable); //determine output

        the unmodifiableList creates a read only view of the list. It does not create a new list
        When list chnages,unmodifable changes as well.
        You cannot make changes to the unmodifiable list directly.

        //
        List<Integer> list = new ArrayList<>(List.of(10, 15, 20, 25, 5));
        List<Integer> sublist = list.subList(2, 5);
        sublist.remove(1);
        sublist.sort(Comparator.naturalOrder());
        System.out.println(list);

        //
        List<Integer> list = new ArrayList<>(List.of(10, 15, 20, 25, 5));
        List<Integer> sublist = list.subList(2, 5);
        sublist.remove(1);
        sublist.sort(Comparator.naturalOrder());
        System.out.println(list);

        sublist is 20 25 5
        sublist removes inddex 1 which is 25. list also removes 25
        sublist sorts to 5 20
        list is now [10 15 5 20] bc 5 and 20 sorted in sublist


        List<String> list = new ArrayList<>(List.of("apple", "banana", "apple", "orange"));

        for (String fruit : list) {
            if (fruit.equals("apple")) {
            list.remove(fruit);  // 🚨 ConcurrentModificationException
         }
}
the above code throws a ConcurrentModificationException

*********
IMPORTANT
If you are iterating over a List in Java using an Iterator, you should use iterator.remove() instead of list.remove() to safely remove elements while iterating.
This avoids ConcurrentModificationException.
**********









     */


}
