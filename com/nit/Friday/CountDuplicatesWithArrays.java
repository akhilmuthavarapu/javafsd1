package com.nit.Friday;

import java.util.Scanner;

public class CountDuplicatesWithArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arrays - it is nothing but a collection of homogeneous elements can be accessable through the index position
		/*int a[]= {1,2,3,4};
		System.out.println("ARRAY OF INTEGER ELEMENTS :");
		for (int i:a)
			System.out.println(i);
		System.out.println();
		System.out.println("ARRAY OF STRING ELEMENTS :");
		
		String s[]= {"akhil","johny","khaja","sai","chakri","naveen"};
		for(String j:s)
			System.out.println(j);
		
		// Using Scanner input
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size:");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("enter "+size+" elements");
		for(int i=0,n;i<b.length;i++)
		{
			n=sc.nextInt();
			b[i]=n;
		}
		for(int k:b)
			System.out.print(k+" ");
		*/
		String str="19122248000555";
		int count[]= {0,0,0,0,0,0,0,0,0,0};
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			int d=ch-'0';
			count[d]++;
			
		}
		for(int j=0;j<count.length;j++)
		{
			if (count[j]>1)
				System.out.print(j+" ");
		}
		
		
		
	}

}
