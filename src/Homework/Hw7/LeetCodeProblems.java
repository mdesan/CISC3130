package Homework.Hw7;

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
    public int buyChoco(int[] prices, int money) {

    }


    public static void main(String [] args ){
        int [] nums = {3,1,2,0,5};

        System.out.println(missingNumber(nums));
    }

}