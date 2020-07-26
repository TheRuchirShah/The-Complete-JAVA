// Using Math.random() Method.

// Math.random() * (max - min + 1) + min  
// The above formula, the min value is inclusive while the max value is exclusive.
// Use this to generate random number between Minimum and Maximum number.


public class RandomNumberExample2  
{  
  public static void main( String args[] )   
  {  
    int min = 100;  
    int max = 500;  
    //Generate random double value from 200 to 400   
    
    System.out.println("Random value of type double between "+min+" to "+max+ ":");  
    double a = Math.random()*(max-min+1)+min;   
    System.out.println(a);  
      
    //Generate random int value from 200 to 400   
    
    System.out.println("Random value of type int between "+min+" to "+max+ ":");  
    int b = (int)(Math.random()*(max-min+1)+min);  
    System.out.println(b);  
  }  
} 
