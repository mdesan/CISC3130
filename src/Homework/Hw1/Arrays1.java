package Homework.Hw1;

import java.util.Objects;

public class Arrays1 {

    public static int indexOf(String[] a, String s){
           for(int i=0;i< a.length;i++){
                if(Objects.equals(a[i], s)){
                    return i;
                }
        }
           return -1;
    }
    public static boolean allEqualTo(String[] a, String s){
        for (String string : a) {
            if (!Objects.equals(string, s)) {
                return false;
            }
        }
        return true;
    }
    public static boolean someEqualTo(String[] a,String s){
        for(String string : a){
            if(Objects.equals(string, s)){
                return true;
            }
        }
        return false;
    }

    public static boolean noneEqualTo(String[] a, String s){
        for(String string : a){
            if(Objects.equals(string, s)){
                return false;
            }
        }
        return true;
    }

    public static boolean equals(String[] a1, String[] a2){
        if(a1.length != a2.length){
            return false;
        }
        for(int i =0; i <a1.length;i++){
            if(!Objects.equals(a1[i], a2[i])){
                return false;
            }
        }
        return true;
    }





    public static void main(String[] args){

    }




}
