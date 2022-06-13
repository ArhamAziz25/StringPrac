import java.util.HashMap;

class FirstDuplicateLetter
{
    public static void main(String[] args) {
        String str="loveleetcode";
       // char strr[]=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        //int count=0;

        // for(int i=0;i<strr.length;i++)
        // {
        //     map.put(i, )
        // }
        for(int i=0;i<str.length();i++)
        {
            // if(!map.containsKey(str.charAt(i)))
            // {
            //     map.put(str.charAt(i), 0);                             // not working

            // }
            // else{
            //    map.put(str.charAt(i), map.get(str.charAt(i))+1);
            // }
           map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
            
        }

             for(int i=0;i<str.length();i++)            
             {
                if(map.get(str.charAt(i))==1)
                {
                    System.out.println(i);
                    System.exit(1);
                   
                }
                
             }
             System.out.println(-1);
             System.exit(1);
        }
    }

