package com.cts.program;
//Class name should like MyString  OR String
public class StringReverse {
	//method name should like revers
	//it should return String , not void
	//variable name should not consist of digits
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
