package com.nit.Friday;

public class StringProgramOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='a',ch2='A';
		int d=ch1-ch2;
		char letter=(char)(ch1-d);
		System.out.println(ch1+" --> "+letter);
		letter=(char)(ch2+d);
		System.out.println(ch2+" --> "+letter);
		String s="Hello chakri and johny dons of nit";
		String result="";
		char each;
		for(int i=0;i<s.length();i++)
		{
			if ((s.charAt(i)>='a') &&(s.charAt(i)<='z'))
			{
				each=(char)(s.charAt(i)-d);
				result+=each;
				
			}
			else if((s.charAt(i)>='A') &&(s.charAt(i)<='Z'))
			{
				each=(char)(s.charAt(i)+d);
				result+=each;
			}
			else
			{
				each=(char)(s.charAt(i));
				result+=each;
			}
		}
		System.out.println(s+" --> "+result);
		System.out.println(s+" ---> "+s.toUpperCase());
		s=s.toUpperCase();
		System.out.println(s+" +++***++ "+s.toLowerCase());
		String a="akhil",res="";
		int len=a.length();
		for (int i=len-1;i>=0;i--)
		{
			res+=a.charAt(i);
		}
		if (s==res)
			{
			System.out.println(a+" -->"+res);
			}
		
	}

}
