import java.util.*;
import java.lang.*;
import java.io.*;

class SquareSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sn = new Scanner(System.in);
		int t = sn.nextInt();
		 
		for(int i =0;i<t;i++){
		int n =sn.nextInt() , firstTerm = 0, secondTerm = 1;

    for (int j = 1; j <= n; ++j) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
		}
	}
}
}
