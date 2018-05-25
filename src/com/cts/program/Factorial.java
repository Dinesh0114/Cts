package com.cts.program;

public class Factorial {
	
public int fact(int number)
{
	int i,fact=1;
	
	for(i=1;i<=number;i++)
	{
		fact=fact*i;
	}
	return fact;
	
}
}
