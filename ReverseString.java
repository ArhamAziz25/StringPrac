
public class ReverseString {
    public static void main(String[] args) {
        String str="  the sky               is blue";
        String str1="";
        int i=str.length()-1;
        while(i>=0 ) // Will traverse from last
        {
            while(i>=0 && str.charAt(i)==' ')  // Checks if cheracter is space it will decrement the pointer(ignore)
            {
                i--;
            }
            int j=i; //Assign j as i as soon as it gets any chracter other than space
            // if(i<0)
            // {
            //     break;
            // }

            while(i>=0 && str.charAt(i)!=' ') // Now checks for Non space character and decrement until find space
            {
                i--;
            }

            if(str1.isEmpty()) // if string is empty just concatinate in empty string
            {
                str1=str1.concat(str.substring(i+1, j+1));
            }
            else
            {
                str1=str1.concat(" "+str.substring(i+1, j+1)); // If not empty just add space and concatinate
            }
        }
        String temp=str1.trim();  // remove all leading and trailing spaces
        System.out.println(temp);
    }
    
}
