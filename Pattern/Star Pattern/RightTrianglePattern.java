// Star Pattern
// Right Triangle Star Pattern

/*

*
* *
* * *
* * * *
* * * * * 

*/


public class RightTrianglePattern   
{   
    public static void main(String args[])   
    {   
        //i for rows and j for columns      
        //row denotes the number of rows you want to print  
        int i, j, row=5;    //outer loop for rows  
    
        for(i=0; i<row; i++)   
        {   
            for(j=0; j<=i; j++)   //inner loop for columns
            {   
                System.out.print("* ");    //prints stars
            }
    
        System.out.println();   //throws the cursor in a new line after printing each line
        }   
    }  
} 
