package com.nec.thursday;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0123,d=0,sum=0,max=0,min=1,even=0,odd=0;
		while (n!=0)
		{
			d=n%10;
			even=((d%2)==0)?even++:odd++;
			sum+=d;
			if (d>max)
			{
				max=d;
			}
			if (d<min)
			{
				min=d;
			}
			n/=10;
			
		}
		System.out.println("even: "+even);
		System.out.println("odd: "+odd);
		System.out.println("max ---> "+max);
		System.out.println("min ---> "+min);
		System.out.println("sum ---->"+sum);
		/*
		int n=99345,p=1,r,res=0;
		while(n!=0)
		{
			r=n%10;
			if (r==3)
			{
				r+=9;
			}
			res=res+ r*p;
			n/=10;
			p*=10;
		}
		System.out.println(" result : "+res);
		*/
		
	}

}
