package com.cts.program;

public class Palindrome {
	
	//should return true false
	//avoid SOP statement here.
	public void pal(int x)
	{
		int y=0;
		int verify = x;
		while(x!=0)	
		{	
			int z=x%10;
			y=y*10+z;
			x=x/10;
		}
		if(verify==y)
		{
			System.out.print("given number is an palindrome");
		}
		
		else
		{
			System.out.print("given number is not an palindrome");
		}
	}

}
