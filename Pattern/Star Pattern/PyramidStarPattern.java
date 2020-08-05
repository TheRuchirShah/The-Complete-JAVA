// Star Pattern
// Pyramid Star Pattern


public class PyramidStarPattern  
{    
    public static void main(String args[])   
    {    
        //i for rows and j for columns      
        int i, j, row = 5;       
        for (i=0; i<row; i++)       //Outer loop work for rows  
        {  
            for (j=row-i; j>1; j--)     //inner loop work for space      
            {    
                System.out.print(" ");   
            }   

        for (j=0; j<=i; j++ )     //inner loop for columns
            {         
                System.out.print("* ");   
            }   
            System.out.println();       //throws the cursor in a new line after printing each line
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
