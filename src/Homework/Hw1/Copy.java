package Homework.Hw1;

public class Copy {

    public static int[] copyOf(int [] arr){

        if(arr == null){
            return null;
        }
        int [] newArr = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }

    public static int [] copyOf(int [] arr, int newLength){

        if(arr == null){
            return null;
        }

        int [] newArr = new int[newLength];

        for(int i =0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        if(newLength>arr.length) {
            for (int i = arr.length; i < newLength; i++) {
                newArr[i] = 0;
            }
        }
        return newArr;
    }

    public static int[] copyOfRange(int [] arr, int from, int to){

        if(arr == null){
            return null;
        }
        int [] newArr = new int[to-from];
        for(int i=0; i<(to-1);i++){
            newArr[i]=arr[from];
            from++;
        }
        return newArr;

    }

    public static void main(String[] args){

        int [] arr = {5,10,15,20,25};
        int [] newArr =  copyOfRange(arr,1,3);


        for(int i =0; i < newArr.length;i++){
            System.out.println(newArr[i]);
        }


    }





}
