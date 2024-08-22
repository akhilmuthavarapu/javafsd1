package com.nec.thursday;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if - condition
		int i=1;
		if(i>0)
		{
			System.out.println("i is a positive value");
		}
		//if - else
		if (i!=1)
		{
			System.out.println("not equal to 1");
		}
		else
		{
			System.out.println("1");
		}
		//nested if
		if (i!=0)
		{
			if (i==1)
			{
				System.out.println("it is one");
			}
			else
			{
				System.out.println("not equal to one");
			}
		}
		else
		{
			if (i==0)
			{
				System.out.println("else block if condition");
			}
			else
			{
				System.out.println("else block else");
			}
		}
		
		//Else if ladder
		if(i==0)
		{
			System.out.println("if condition");
		}
		else if(i>0)
		{
			System.out.println("else if block");
			
		}
		else
		{
			System.out.println("else block");
		}
	}

}
