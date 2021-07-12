import java.util.*;
import java.io.*;
class OddSeries
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number:");
		int n = Integer.parseInt(obj.readLine());
		test(n);
	}
	public static void test(int n)
	{
		int j =0;
		
			for(int i =1; i <= n; i++)
			{
				System.out.print((i+j)+" ");
				j++;
			}
		
	}
}