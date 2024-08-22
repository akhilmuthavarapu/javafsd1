package com.nec.thursday;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 

		 */
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		/*
1 
2 1 
3 2 1 
4 3 2 1 
5 4 3 2 1 */
		System.out.println();
		
		for(int r=1;r<=5;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 */
		System.out.println();
		for(int r=1,v=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(v+++" ");
			}
			System.out.println();
		}
/*
1 
1 0 
1 0 1 
1 0 1 0 
1 0 1 0 1  
 */
		System.out.println();
		for(int r=1;r<=5;r++)
		{
			for(int c=1,v=1;c<=r;c++)
			{
				System.out.print(v+" ");
				if (v==1)
					v=0;
				else
					v=1;
			}
			System.out.println();
		}
/*
 1 
0 1 
0 1 0 
1 0 1 0 
1 0 1 0 1 

 */
		System.out.println();
		for(int r=1,v=1;r<=5;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(v++%2+" ");
				
			}
			System.out.println();
		}
		System.out.println();
/*
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
 */
		for(int r=5;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
/*
5 4 3 2 1 
4 3 2 1 
3 2 1 
2 1 
1 
 */
		System.out.println();
		for(int r=5;r>=1;r--)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		System.out.println();
/*
1 2 3 4 5 
6 7 8 9 
10 11 12 
13 14 
15 
 */
		for(int r=5,v=1;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(v+++" ");
			}
			System.out.println();
		}
/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
 */
		
		for(int r=1,b=5;r<=5;r++)
		{
			for (int c=1;c<=b;c++)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=r;a++)
			{
				System.out.print(r+" ");
			}
			System.out.println();
			b-=1;
		}
		System.out.println();
/*
* * * * * * 
*         *
*         *
*         *
*         *
* * * * * * 
 */
		for(int r=0,b=8;r<=5;r++)
		{
			if (r==0||r==5)
			{
				for(int c=1;c<=6;c++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
			}
			else{
				System.out.print("* ");

			
			for (int a=1;a<=b;a++)
			{
				System.out.print(" ");
			}
			System.out.println("*");
			}
		}
	}

}
