// Number Pattern
// Binary Number


public class BinaryNumber
{
    public static void main(String[] args)   
    {  
        int rows=9;   //number of rows to print  
        for (int i = 1; i <= rows; i++)   
        {  
            int num;  
            if(i%2 == 0)  
            {  
                num = 0;  
                for (int j = 1; j <= rows; j++)  
                {  
                    System.out.print(num);  
                    num = (num == 0)? 1 : 0;  
                }  
            }  
            else  
            {  
                num = 1;  
                for (int j = 1; j <= rows; j++)  
                {  
                    System.out.print(num);  
                    num = (num == 0)? 1 : 0;  
                }  
            }  
            System.out.println();  
        }  
    }  
}     


/*

OUTPUT :-
1
2 1
3 2 1
4 3 2 1 
5 4 3 2 1
6 5 4 3 2 1

*/
