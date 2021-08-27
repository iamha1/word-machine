import java.util.*;

class Solution {
    public int solution(String S) {


        Stack<Integer> STACK = new Stack<Integer>();
try {
        
        for (String i: S.split(" ")) {
         // System.out.println(i);
         
         if (isNumeric(i)){
             STACK.push(Integer.parseInt(i));
         }
         if (i.equals("-")){
             int top = STACK.pop();
             int next = STACK.pop();
             int result1 = top - next;
             STACK.push(result1);

         }
         if(i.equals("+")){
             int top = STACK.pop();
             int next = STACK.pop();
             int result2 = top + next;
             STACK.push(result2);
         }
         if(i.equals("POP")){
             STACK.pop();
         }
         if(i.equals("DUP")){
            int top = STACK.pop();
            STACK.push(top);
            STACK.push(top);
         }

         }
         return STACK.pop();
    
    }
    catch (Exception e){
        return -1;
    }
    }
    //Check if the string has number:

    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        int num = Integer.parseInt(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
}
   
