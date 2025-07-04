package Study;

import java.util.*;

public class LeetCode {

    public static void main(String[] args){
        int[] arr = {0,3,2,45,4,6,1,1};
        System.out.println(longestConsecutive(arr));

    }
    public static int longestConsecutive(int[] nums){

        Set<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        int maxCount =0;
        int count =0;
        int curr;

        for(int num: nums){
            curr=num;
            if(!set.contains(curr-1)){

                while(set.contains(curr)){

                    count++;
                    curr=curr+1;
                }

                maxCount = Math.max(maxCount, count);

            }

        }
        return maxCount;
    }

    public static int mostFrequentEven(int [] nums){
        Map<Integer, Integer> map = new HashMap<>();

        //fill map
    }






}
