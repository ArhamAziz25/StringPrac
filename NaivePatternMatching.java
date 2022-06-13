

public class NaivePatternMatching {
    
    public static void main(String[] args) {
                 //[0123456789101112]
        String str="ABCABCADBCABC"; //13
        String str2="ABC"; //3
        int n=str.length(); // 13       //n-p=13-3=10
        int p=str2.length();
        for(int i=0;i<=(n-p);i++)   // Slides the window
        {
            int k;
           
            for(k=0;k<p;k++){    // decides size of window
            
                if(str2.charAt(k)!=str.charAt(i+k))    // decides chracter 
                {
                    break;
                }

            }
            if(k==p)
            {
                System.out.println("Found"+i);
            }
        }
    }
    
}

