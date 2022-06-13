
public class SubStringPalindrome {
    public static void main(String[] args) {
        String sc="abccbc";
        for(int i=0;i<sc.length();i++)
        {
            for(int j=i+1;j<=sc.length();j++) //wrote j<=sc.length()   because endindex always wrote as lastindex+1 ----->
            {
                String temp=sc.substring(i, j);
               

                if(ispalindrome(temp))
                {
                    System.out.println("Palindrome String is"+temp);
                }
            }
            
        }
    }

    static boolean ispalindrome(String str) //Used static because we didnt want to make object to call function;
    {
        int i=0;
        int j=str.length()-1;
       // String sc=temp.toLowerCase();
        while(i<=j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
               
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
}
