import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        String str="a";
        String str1="ab";

        char ar[]=str.toCharArray();
        char ar2[]=str1.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ar2);
        int ln=ar.length<ar2.length?ar.length:ar2.length;
        int j=0;
        if(ar.length!=ar2.length)
        {
            System.out.println("false");
            System.exit(1);
        }
        for(int i=0;i<ln;i++)
        {
            if(ar[i]==ar2[j])
            {
                j++;
            }
            else{
                System.out.println("false");
                System.exit(1);
            }
        }
        System.out.println("true");
        System.exit(1);

       
        
        
    }
    
}
