package com.cts.program;

public class StringReverse {
public void string(String str1)
{
	
	char ch[]=str1.toCharArray();
    // String strResult="";
	for(int i=ch.length-1;i>=0;i--)
	{
		System.out.print(ch[i]);
		//strResult=strResult+ch[i];
	}
	//System.out.println(strResult);
}
}
