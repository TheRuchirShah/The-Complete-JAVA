// Number Pattern
// Right Triangle Number Pattern


public class RightTriangleNumberPattern2
{
	public static void main(String[] args)   
	{  
		int i, j, k = 1;  
		
		for (i = 1; i <= 5; i++)	//inner loop  
		{
			for (j = 1; j< i + 1; j++)	//outer loop
			{
				//prints the value of k
				System.out.print(k++ + " ");
			}
			System.out.println();	//throws the cursor at the next line
		}
	}
}


/*
OUTPUT :-

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/
