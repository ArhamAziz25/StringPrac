class StringToInteger
{
    public static void main(String[] args) {
        String str="121000001";
        int n=str.length();
        int sign=1; //To handle sign of string
        int index=0; //Index of string
        int r=0;
        while(index<n && str.charAt(index)==' ') //To handle spaces before string Eg:- "       912"
    {
        index++;
    }
    if( index<n && str.charAt(index)=='+') //Handling if number given in string is positive 
    {
        index++;
    }
    else if(index<n && str.charAt(index)=='-') //Handling if number given in string is negative
    {
        sign=-1;
        index++;
    }

    while(index<n && Character.isDigit(str.charAt(index))) //To handle if there is any alphabet in given string
    {
        int Digit=str.charAt(index)-'0'; // -'0' is for finding esky value of number(it is like a formula)
        if(r>Integer.MAX_VALUE/10 || (r==Integer.MAX_VALUE/10 && Digit>Integer.MAX_VALUE%10)) //To Handle overflow and underflow condition// Herer we first check that our number is
        // less that MAX VALUE of integer OR is (equal to MAX VALUE of integer && last digit of our result >last digit og INTEGER.MAXVALUE 
        {
            System.out.println(sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE);
        }
        r=r*10+Digit;
        index++;
    }
    System.out.print(sign*r);
    }
}