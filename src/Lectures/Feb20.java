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

      View Collections
        -most collections manage storage for elements they contain
        - view collection do not store elements










     */


}
