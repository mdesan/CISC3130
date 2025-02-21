package Homework.Hw1;

public class Arrays2 {

    public static void main(){
    }

    public static int[] copy(int[] arr){

        if(arr==null){
            return null;
        }
        int [] newArr = new int[arr.length];

        for(int i = 0;i< newArr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public static int[] copyOf(int [] arr, int newLength){
        if(arr==null){
            return null;
        }
        int [] newArr = new int[newLength];
        int i =0;
        while(i< arr.length && i<newLength){
            newArr[i]=arr[i];
            i++;
        }
        while(i<newLength){
            newArr[i]=0;
            i++;
        }
        return newArr;
    }

    public static int[] copyOfRange(int [] arr, int from, int to){

        if(arr == null){
            return null;
        }

        int newSize = to-from;
        int[] newArr = new int[newSize];

        int i = 0;

        for(int j =from; j<to;j++){
            newArr[i]= arr[j];
            i++;
        }
        return newArr;

    }


}
