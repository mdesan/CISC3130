//package Study;
//
//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.Objects;
//
//public class CodeWithStacks {
//
//    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//    public boolean isValid(String s) {
//
//        if(s.isEmpty()){
//            return true;
//        }
//
//        Deque<Character> stack = new ArrayDeque<>();
//
//
//        for(int i =0; i<s.length();i++){
//            if(isOpen(s.charAt(i))){
//                stack.push(s.charAt(i));
//            }
//            else if(isClosed(s.charAt(i))){
//                if(stack.isEmpty()){
//                    return false;
//                }
//                else if(!isMatched(stack.pop(), s.charAt(i))){
//                    return false;
//                }
//            }
//        }
//        if(!stack.isEmpty()){
//            return false;
//        }
//        return true;
//
//    }
//
//    public static boolean isOpen(char c){
//        return c=='('||c=='{' ||c=='[';
//    }
//
//    public static boolean isClosed(char c){
//        return c==')'||c=='}' ||c==']';
//    }
//
//    public static boolean isMatched(char opening, char closing){
//        if(opening=='(' && closing==')'){
//            return true;
//        }
//        if(opening=='{' && closing=='}'){
//            return true;
//        }
//        if(opening=='[' && closing==']'){
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean isSorted(Deque<Integer> stack){
//
//        if(stack.isEmpty()){
//            return true;
//        }
//        Deque<Integer> copy = new ArrayDeque<>(stack);
//
//        int top = copy.pop();
//
//        while(!copy.isEmpty()){
//            int next =copy.pop();
//            if(top>next){
//                return false;
//            }
//            top=next;
//        }
//        return true;
//
//    }
//
//    //generic version of the isSorted method
//    public static <E extends Comparable<E>> boolean isSorted(Deque<E> stack){
//        if(stack.isEmpty()){
//            return true;
//        }
//        Deque<E> copy = new ArrayDeque<>(stack);
//
//        E top = copy.pop();
//
//        while(!copy.isEmpty()){
//            E next =copy.pop();
//            if(top.compareTo(next)>0){
//                return false;
//            }
//            top=next;
//        }
//        return true;
//
//    }
//
//    public static <E> boolean equals(Deque<E> stack1, Deque<E> stack2){
//
//        if(stack1.size()!= stack2.size()){
//            return false;
//        }
//        if(stack1.isEmpty()&&stack2.isEmpty()){
//            return true;
//        }
//
//        Deque<E> copy1 = new ArrayDeque<>(stack1);
//        Deque<E> copy2 = new ArrayDeque<>(stack2);
//
//        while(!copy1.isEmpty()){
//            if(!Objects.equals(copy1.pop(),copy2.pop())){
//                return false;
//            }
//        }
//        return true;
//    }
//
//    public static <E> boolean contains(Deque<E> stack, E object){
//        if(stack.isEmpty()){
//            return false;
//        }
//        Deque<E> copy = new ArrayDeque<>(stack);
//
//        while(!copy.isEmpty()){
//            if(Objects.equals(copy.pop(),object)){
//                return true;
//            }
//        }
//        return true;
//
//    }
//
//
//    public static int evalRPN(String[] tokens) {
//        Deque<String> stack = new ArrayDeque<>();
//
//
//        for(int i =0;i<tokens.length;i++){
//            String token = tokens[i];
//            if(isInteger(token)){
//                stack.push(token);
//            }
//            else{
//                int int1 = Integer.parseInt(stack.pop());
//                int int2 = Integer.parseInt(stack.pop());
//                switch (token){
//                    case "+":
//                        stack.push(String.valueOf(int1+int2));
//                        break;
//                    case "-":
//                        stack.push(String.valueOf(int2-int1));
//                        break;
//                    case "*":
//                        stack.push(String.valueOf(int2*int1));
//                        break;
//                    case "/":
//                        stack.push(String.valueOf(int2/int1));
//                }
//
//            }
//        }
//        int result = Integer.parseInt(stack.pop());
//        return result;
//
//
//    }
//    public static boolean isInteger(String s){
//        try{
//            Integer.parseInt(s);
//            return true;
//        }
//        catch(NumberFormatException e){
//            return false;
//        }
//    }
//
//    public static int checkBalance(String s){
//        Deque<Character> stack = new ArrayDeque<>();
//
//        for(int i =0;i<s.length();i++){
//            char token = s.charAt(i);
//            if(isOpen(token)){
//                stack.push(token);
//            }
//            else if(isClosed(token)){
//                if(!isMatched(stack.pop(),token)){
//                    return i;
//                }
//            }
//        }
//        if(!stack.isEmpty()){
//            return s.length()-1;
//        }
//        return -1;
//
//    }
//
//
//
//
//    public static void main(String [] args){
//        Deque<Integer> stack = new ArrayDeque<>();
//
//       stack.push(4);
//       stack.push(3);
//       stack.push(2);
//       stack.push(1);
//
//        System.out.println(isSorted(stack));
//    }
//}
