// A palindrome number is a number that is same after reverse. For example 54345, 151 are the palindrome numbers. 
// It can also be a string like LOL, MADAM, EVE etc.


class PalindromeExample
{  
  public static void main(String args[])
  {  
    int r,sum=0,temp;    
    int n=454;    //It is the number variable to be checked for palindrome  
    
    temp=n;    
    
    while(n>0)
    {    
      r=n%10;   // Remainder  
      sum=(sum*10)+r;    
      n=n/10;    
    }    
    if(temp==sum)    
    {
      System.out.println("palindrome number ");    
    }
    else    
    {
      System.out.println("not palindrome");    
    }
  }  
}
