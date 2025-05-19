package Study;

import java.util.*;

public class CodeWithPriorityQueue {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            maxHeap.add(i);
        }
        while (maxHeap.size() > 1) {

            int first = maxHeap.remove();
            int second = maxHeap.remove();

            if (first != second) {
                maxHeap.add(first - second);
            }


        }
        if(maxHeap.isEmpty()){
            return 0;
        }
        return maxHeap.peek();

    }




}
