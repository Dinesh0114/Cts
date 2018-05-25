package com.cts.exceptionalhandlingtest;

import com.cts.exceptionhandling.Handling;

public class HandlingTest {
	public static void main(String[] args) {
		Handling handling = new Handling();

		try {
			int x, y;
			x = Integer.parseInt("30");
			y = Integer.parseInt("as");

			System.out.println(handling.divide(x, y));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			// this exception occurs when one is string and another one is integer.
			System.out.println("Enter Integer alone");
			e.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			// this exception occurs when one of the parameter doesnt passes.
			System.out.println("Pass two parameters");
			e.printStackTrace();
		}

		catch (NullPointerException e) {
			// TODO Auto-generated catch block
			// it is occured when passing parameter.when the parameter value is null or
			// empty.
			System.out.println("Empty or null");
			e.printStackTrace();
		}

	}
}
