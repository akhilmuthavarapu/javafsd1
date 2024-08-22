package com.nec.thursday;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**  
		 * loops are a iterative statements used to repeat a block of statements for certain range based on condition
		 ----> do - while ----> [EXIT LOOP]
		 ----> while ----> [ENTRY LOOP]
		 -----> for loop ---> [ENTRY LOOP]
		 **/
		// do - while loop
		int i=7;
		System.out.println("welcome to do while loop :");
		do {
			if (i%2==0) System.out.println(i);
			i++;
		}while(i<10);
		
		// while loop
		System.out.println("welcome to while loop :");
		while(i<20)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("welcome to for loop :");
		for(i=0;i<10;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("********* Nested Loops****************");
		System.out.println("nested do while with while :");
		do {
			System.out.println(i);
			while(i<20)
			{
			System.out.println(i);	
			i++;
			}
			i++;
		}while(i<30);
		System.out.println("nested do while with for loop: ");
		
		do {
			System.out.println(i);
			for(;i<=35;i++)
			{
				System.out.println(i);
			}
			i++;
		}while(i<40);
		i=0;
		do {
			System.out.println("in do 1  "+i);
			do
			{
				System.out.println("in do 2   "+i);
				i++;
			}while (i<5);
			i++;
		}while(i<5);
		
		System.out.println("******************* Nested loop using for loop *****************");
		for (int a=0;a<2;a++)
		{
			System.out.println("in for loop 1 :"+a);
			for (int b=0;b<=5;b++)
			{
				System.out.println("in for loop 2:"+b);
			}
		}
		System.out.println("**************** Nested for loop with while loop***************");
		for (int a=0;a<2;a++)
		{
			System.out.println("in for loop:"+a);
			int b=0;
			while(b<=5)
			{
				System.out.println("in while loop:"+b);
				b++;
			}
		}
		
		System.out.println("*********Nested for loop with do while loop************");
		for (int a=0;a<2;a++)
		{
			System.out.println("in for loop 1 :"+a);
			int b=0;
			do
			{
				System.out.println("in do while loop:"+b);
				b++;
			}while(b<=5);
		}
		System.out.println("*********Nested while  loop with do while loop************");
		int a=0;
		while(a<2)
		{
			System.out.println("in while loop :"+a);
			int b=0;
			do
			{
				System.out.println("in do while loop:"+b);
				b++;
			}while(b<=5);
			a++;
		}
		
		System.out.println("*********Nested while  loop with  while loop************");
		a=0;
		while(a<2)
		{
			System.out.println("in while loop :"+a);
			int b=0;
			while(b<=5)
			{
				System.out.println("in do while loop:"+b);
				b++;
			}
			a++;
		}
		
		System.out.println("*********Nested while  loop with for loop************");
		a=0;
		while(a<2)
		{
			System.out.println("in while loop :"+a);
			for(int b=0;b<=5;b++)
			{
				System.out.println("in for loop:"+b);
				
			}
			a++;
		}
		
		
		/*
		int count=0;
		for (;i<100;i+=10)
		{
			System.out.println(i);
		}
		for (i=100;i<200;i++)
		{
			int n=i,r;
			while(n!=0)
			{
				r=n%10;
				if(r==7)
				{
					System.out.println(i);
					count++;
					
					break;
				}
				n/=10;
			}
		}
		System.out.println("count of 7's"+count);*/
	}

}
