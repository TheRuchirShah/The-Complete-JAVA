//A positive number is called armstrong number if it is equal to the sum of cubes of its digits.
// Example 0, 1, 153, 1634 etc.

public class ArmstrongExample
{  
  public static void main(String[] args) 
  {  
    int c=0,a,temp;  
    int n=153;    //It is the number to check armstrong  
    
    temp=n;  
    
    while(n>0)  
    {  
      a=n%10;  
      n=n/10;  
      c=c+(a*a*a);  
    }  
    if(temp==c)  
    {
      System.out.println("It is an Armstrong Number");   
    }
    else
    {  
      System.out.println("It is Not an Armstrong Number");
    }
  }
} 

/*
OUTPUT:-

It is an Armstrong Number

*/
