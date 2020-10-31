// Number Pattern
// Left Angle Triangle Number Pattern


public class LeftAngleTriangleNumberPattern
{
	public static void main(String args[])
	{
		int i, j,number, n=7;
		//loop for rows
		for(i=0; i<n; i++)
		{
			number=1;
			
			//loop for columns
			for(j=0; j<=i; j++)
			{
			//prints num
			System.out.print(number+ " ");
			
			//incrementing the value of number
			number++;
			}
			//throws the cursor at the next line after printing each row
			System.out.println();
		}
	}
}  


/*

OUTPUT :-

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5 
1 2 3 4 5 6
1 2 3 4 5 6 7

*/
