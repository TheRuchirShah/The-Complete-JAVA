// Number Pattern
// Pascal Triangle Program


public class PascalTriangleProgram
{
	public static void main(String[] args)   
	{  
		int n = 5;	//n is the number of rows you want to print  
		for (int i = 0; i < n; i++)   
		{  
			int number = 1;  
			System.out.printf("%" + (n - i) * 2 + "s", "");  
			
			for (int j = 0; j <= i; j++)   
			{  
				System.out.printf("%4d", number);  
				number = number * (i - j) / (j + 1);  
			}  
			System.out.println();  
		}  
	}  
}  


/*

OUTPUT :-
    1
   1 1
  1 2 1
 1 3 3 1 
1 4 6 4 1

*/
