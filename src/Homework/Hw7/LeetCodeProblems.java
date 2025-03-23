package Homework.Hw7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCodeProblems {

    //has to run O(1)
    public static int findNonMinOrMax(int [] nums){

        if(nums.length<=2){
            return -1;
        }
        int num1 = nums[0];
        int num2 = nums[1];
        int num3= nums[2];

        int max = Math.max(num1, Math.max(num2,num3));
        int min =  Math.min(num1, Math.min(num2,num3));

        if(num1!= max && num1!=min){
            return num1;
        }
        else if(num2!= max && num2!=min){
            return num2;
        }
        else if(num3!= max && num3!=min){
            return num3;
        }
        return -1;
    }
    //has to run O(n)
    public static int missingNumber(int [] nums){

        int size = nums.length;
        int numsSum = 0;
        int sum = (size*(size+1))/2;

        for(int i=0;i<size;i++){
            numsSum+=nums[i];
        }

        int diff = sum - numsSum;

        return diff;

    }

    //has to run O(n)
    //the intuitive approach would be O(n^2). here is the O(n^2) approach.
//    public static int buyChoco(int[] prices, int money) {
//        int best = Integer.MIN_VALUE;
//
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int sum = prices[i] + prices[j];
//                if (((money - sum) > best) && ((money - sum >= 0))) {
//                    best = money - sum;
//                }
//            }
//        }
//        if (best == Integer.MIN_VALUE){
//            return money;
//    }
//        return best;
//
//    }

    // optimal approach O(n)
    public static int buyChoco(int[] prices, int money) {

        int min = Integer.MAX_VALUE;

        int minIndex =-1;

        //loop finds the minimum
        for(int i=0;i< prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
                minIndex=i;
            }
        }

        //loop finds the second minimum
        int secMin = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(i!=minIndex){
                if(prices[i]<secMin){
                    secMin=prices[i];
                }
            }
        }

        int result =  money - (min + secMin);

        if(result < 0){
            return money;
        }

        return result;

    }

    //has to be O(n)
    public static int maxProduct(int [] nums){

    }







    public static void main(String [] args ){
        int [] nums = {98,54,6,34,66,63,52,39};

        System.out.println(buyChoco(nums, 62));
    }

}