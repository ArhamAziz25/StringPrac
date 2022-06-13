import java.util.Stack;

public class ValidParathesis {
    public static void main(String[] args) {
        String str="([)";
      //  int count=0;
      System.out.println(isvalid(str));
    }

    static Boolean isvalid(String str)
    {
    Stack<Character> stak = new Stack<>();
    for(int i=0;i<str.length();i++)
    {
        if(stak.isEmpty() &&( str.charAt(i)==']' || str.charAt(i)=='}' || str.charAt(i)==')') )
        {
            return false;
        }
        if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
        {
            stak.push(str.charAt(i));
        }
        else if(stak.peek()=='(' && str.charAt(i)==')')
        {
            stak.pop();
        }
        else if(stak.peek()=='{' && str.charAt(i)=='}')
        {
            stak.pop();
        }
        else if(stak.peek()=='[' && str.charAt(i)==']')
        {
            stak.pop();
        }
       

    }
    if(stak.isEmpty())
    {
        return true;
    }
    else{
        return false;
    }
}
    
}
