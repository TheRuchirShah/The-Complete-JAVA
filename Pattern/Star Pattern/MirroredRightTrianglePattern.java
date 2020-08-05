// Star Pattern
// Mirrored Right Triangle Star Pattern


public class MirroredRightTrianglePattern
{  
    public static void main(String[] args)  
    {  
        int n=5;  
        for (int i= 0; i<= n; i++)      //inner loop  
        {  
            for (int j=1; j<=n-i; j++)      //outer loop
            {  
                System.out.print(" ");  
            }  
            for (int k=0;k<=i;k++)  
            {  
                System.out.print("*");  
            }   
        System.out.println("");  
        }  
    }  
}


/*
OUTPUT :-

        *
      * *
    * * *
  * * * *
* * * * *

*/
