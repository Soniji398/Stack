import java.util.*;

public class ValidParaenthesis {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(validParaenthesis(str)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static boolean validParaenthesis(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            if(ch == ')'){
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() != '(')
                    return false;
                else
                    stack.pop();
            }
            if(ch == '}'){
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() != '{')
                    return false;
                else
                    stack.pop();
            }
            if(ch == ']'){
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() != '[')
                    return false;
                else
                    stack.pop();
            }
        }
        if(!stack.isEmpty())
            return false;
        return true;
    }
}
