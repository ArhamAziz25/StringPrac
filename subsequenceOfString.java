
import java.util.ArrayList;

public class subsequenceOfString {
    public static void main(String[] args) {
        String str="abcd";
        ArrayList<String> arList=new ArrayList<>();

        for(int i=0;i<str.length();i++)
        {
            char Newcharacter=str.charAt(i);
            if(arList.size()==0)
            {
                arList.add(""); //Addition of blank space
                arList.add(""+Newcharacter); //Adddition of first character that is "a" here
                continue;
            }

            int lenOfArrayList=arList.size();
            for(int j=0;j<lenOfArrayList;j++)  //Loop for elements already present in arraylist
            {
                String temp=arList.get(j)+Newcharacter;  // Here we get arraylist element one by one and adding that new character
                arList.add(temp); // Addition of new subsequenses
            }


        }
        System.out.print(arList);
    }
}
