package Lectures;

public class Feb27 {

        /*
        #####Searching and Sorting#####

            Selection sort: orders a list of values by repeatedly putting
            the smallest unplaced value into its final position.
            On each pass, we select the min and put it in its proper place.
            We swap 

            The algorithm:
            - Look through the list to find the smallest value.
            - Swap it so that it is at index 0.
            - Look through the list to find the second-smallest value.
            - Swap it so that it is at index 1.
            - ...
            - Repeat until all values are in their proper places.
         */

    public static void selectionSort(int [] arr){

        for(int i =0; i<arr.length-1;i++){
            int indexOfMin = getIndexOfMin(arr, i);

        }

    }

    public static int getIndexOfMin(int [] arr, int startIndex){
        int min = startIndex;
        for(int i = 1;i< arr.length;i++){
            if(arr[i]<arr[min]){
                min=i;
            }
        }
        return min;
    }





        //Binary Search
        //given a list and a value, return the index of list where the value is at. -1 if not in the list





        }


