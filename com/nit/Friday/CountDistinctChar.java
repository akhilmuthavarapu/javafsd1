package com.nit.Friday;

public class CountDistinctChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*********MY CODE ***********
				String s="111222489000555";
				String res=" ";
				char ch;
				int total=0,dup=0;
				for (int i=0;i<s.length();i++)
				{
					ch=s.charAt(i);
					int count=0;
					for (int j=0;j<s.length();j++)
					{
						if (ch==s.charAt(j))count+=1;
					}
					if (count>1) 
					{
					    boolean dupli=true;
					    for(int a=0;a<res.length();a++)
					    {
					    if (ch==res.charAt(a))
					    {
					        dupli=false;
					        break;
					     }
					}
					if (dupli==true)
					{
					    res+=ch+" ";
					    dup++;
					}
				}
		    }
			System.out.println("duplicates count: "+dup);
		    System.out.println("duplicate elements:"+res);
		}

	}


