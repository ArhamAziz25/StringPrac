


public class Palindrome
{
    public static void main(String[] args) {
        String scc="Nitin";

        int i=0;
        int j=scc.length()-1;
        String sc=scc.toLowerCase();
        while(i<j)
        {
            if(sc.charAt(i)!=sc.charAt(j))
            {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");
        
    }
}