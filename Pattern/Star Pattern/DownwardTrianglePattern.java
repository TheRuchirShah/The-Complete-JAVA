// Star Pattern
// Downward Triangle Star Pattern


public class DownwardTrianglePattern
{  
    public static void main(String[] args)
    {
        int rows=5;
        for (int i= rows-1; i>=0 ; i--)     //inner loop
        {
            for (int j=0; j<=i; j++)        //outer loop
            {
                System.out.print("*" + " ");
            }
        //throws the cursor in the next line after printing each line
        System.out.println();
        }
    }
}


/*
OUTPUT :-

* * * * *
* * * *
* * *
* *
*

*/
