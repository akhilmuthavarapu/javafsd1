package com.nit.Friday;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Get Unique Dept List

		
		//Result---> "HR","Sales","IT"
		String[] dept ={"HR","IT","Sales","HR","IT","HR","Sales"};
		String str="";
		String []newlist = {"","","","","","",""};
		boolean got = false;
		for(int i=0;i<dept.length;i++)
		{
		    if(str.contains(dept[i])) continue;
		    else str+=dept[i]+", ";
		    for(int j=0;j<newlist.length;j++)
		    {
		    	if(newlist[j]==dept[i])
		    		break;
		    	else
		    		got=true;
		    }
		    if (got)
		    {
		    	newlist[i]=dept[i];
		    }
		    
		}
		System.out.println("Using String:  "+str);
		System.out.println("Using Array:  ");
		for(String s:newlist)
			System.out.println(s);
			
	
		
	}

}
