package com.cts.program;

public class Individual {
	int sum=0;
	//change the method name  ( check for all other methods...should be meaning full)
	//avoid using recursion
	
public int digit(int a)
{

if(a==0)
{
	return sum;
}
else
{
	
	sum+=(a%10);
	digit(a/10);

}
return sum;
	
}
}
