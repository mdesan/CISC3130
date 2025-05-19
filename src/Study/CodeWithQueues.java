package Study;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Queue;

public class CodeWithQueues {

    //a b c -> a b c c b a
    public static void mirror(Queue<String> queue){

        //need to have this size variable and loop as many as size. NOT while queue is not empty
        int size = queue.size();
        Deque<String> stack = new ArrayDeque<>();

       for(int i =0;i<size;i++){
            String s =queue.remove();
            stack.push(s);
            queue.add(s);
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }

    }

//    public static void stutter(Queue<Integer> queue){
//        int size = queue.size();
//
//        for(int i =0;i<size;i++){
//           int num = queue.remove();
//           queue.add(num);
//           queue.add(num);
//        }
//
//
//    }

    public static <E> void stutter(Queue<E> queue){
        int size= queue.size();

        for(int i =0;i<size;i++){
            E val = queue.remove();
            queue.add(val);
            queue.add(val);
        }
    }

    public static <E> boolean equals(Queue<E> q1, Queue<E> q2){
        if(q1.size()!=q2.size()){
            return false;
        }

        boolean isEqual = true;

        int size = q1.size();

        for(int i =0;i<size;i++){
            E e1=q1.remove();
            E e2 =q2.remove();
            q1.add(e1);
            q2.add(e2);

            if(!Objects.equals(e1,e2)){
                isEqual=false;
            }
        }
        return isEqual;

    }

    public static <E> boolean contains(Queue<E> queue, E e){

        if(queue.isEmpty()){
            return false;
        }

        boolean doesContain = false;

        int size=queue.size();

        for(int i =0;i<size;i++){
            E item = queue.remove();
            queue.add(item);

            if(Objects.equals(e,item)){
                doesContain=true;
            }

        }
        return doesContain;

    }


}

