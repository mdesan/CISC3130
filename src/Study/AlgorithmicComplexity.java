package Study;

public class AlgorithmicComplexity {

    /*
    Merge sort is faster than selection sort.

       Big Oh Notation helps us determine a code's time complexity.
        Time complexity is aka running time since thee amount of time it will take the code to run is determined
        by the number of basic steps it must perform.

        fastest to slowest times:
        O(1) constant
        O(log n) logarithmic
            - binary search(iterative and recursive). if we have 1,000,000 elements, it only takes 20 steps. n keeps shrinking exponentially
        O(n) linear
        O(n * log n) log linear . Arrays.sort, Collections.sort, List's sort. Mergesort
            - You have n things to process, and each thing requires O(log n) work.
            - n * log n total work
            - merge sort divides array into halves O(log n) and then merges everything back together O(n)
        O(n^2) quadratic. selectionsort, bubblesort, insertionsort
        O(n^3)
        O(2^n)



     */

    //this method is O(n^2)
    public static void m6(int n){
        int sum =0;
        for(int i =0;i<n;i++){
            for(int j = 0;j<=i;j++){
                sum++;
            }

        }
        System.out.println(sum);
    }

}
