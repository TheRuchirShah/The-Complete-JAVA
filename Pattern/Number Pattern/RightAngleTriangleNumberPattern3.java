// Number Pattern
// Right Angle Triangle Number Pattern 3


import java.util.*;  
public class RightAngleTriangleNumberPattern3
{              
    public static void main(String[] args)   
    {  
        int i, j, rows;  
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of rows you want to print: ");      
        rows = sc.nextInt();           
        
        for (i = 1; i <= rows; i++)   
        {  
            for (j = 1; j <= i; j++)  
            {  
                System.out.print(i+" ");  
            }  
        System.out.println();  
        }           
    }  
}


/*

OUTPUT :-
Enter the number of rows you want to print: 7
1 
2 2 
3 3 3 
4 4 4 4 
5 5 5 5 5 
6 6 6 6 6 6 
7 7 7 7 7 7 7 

*/
