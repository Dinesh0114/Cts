package com.cts.program;

public class Palindrome {
	
	//should return true false
	//avoid SOP statement here.
	public boolean pal(int x)
	{
		//what is pal??   If the method return true/false , it should be isXXX  (isPolindrome, isEven, isEqual etc.,)
		//what is y?
		int y=0;
		//what is verify?
		int verify = x;
		while(x!=0)	
		{	
			int z=x%10;
			y=y*10+z;
			x=x/10;
		}
		if(verify==y)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}

}
