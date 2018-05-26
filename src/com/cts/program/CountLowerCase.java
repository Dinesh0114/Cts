package com.cts.program;

public class CountLowerCase {
	//use camel case
	//format/align the source code before committing in the git.
		public int lowercaseCount(String str) {
			int lower=0 ,len=str.length();
			 for(int i = 0; i < len; i++)
		     {
		         char ch = str.charAt(i);
		         if (ch >= 'a' && ch <= 'z')
		             lower++; 
		     }
			   return lower;
		}
		}

