package Homework.Hw1;

public class Merge {

    public static int [] merge(int [] arr1, int [] arr2){

        int size1 = arr1.length;
        int size2 = arr2.length;
        int totalSize = size1 + size2;

        int [] arr3 = new int[totalSize];

        int i = 0;
        int j = 0;//i is for arr1, j is for arr2
        int k =0; //index for arr3
        while(i<arr1.length && j<arr2.length){ // stops if either one of the arrays is finished
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr2[j];
                j++;
                k++;
            }
        }

        while(i< arr1.length){
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j++;
            k++;
        }

        return arr3;
    }
}
