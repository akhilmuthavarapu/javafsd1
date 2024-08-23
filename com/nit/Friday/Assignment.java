package com.nit.Friday;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * find average salary 
		 * check every emp salry to  avg sal if sal is <avg sal then add 50% of their sal 
		 * prepare new salary lis
		 */
		int[] salaries = {4000,2300,5000,23000,45000,8000,9000,4700,5600};
		int prevsal[]=salaries.clone();
		float  avg=0;
		int newlist[]=new int[salaries.length];
		for(int i:salaries)
		{
			avg+=i;
		}
		avg/=salaries.length;
		System.out.println("Average Salary :"+avg);
		for(int j=0;j<salaries.length;j++)
		{
			if (salaries[j]<avg)
			{
				
				//Another way using separate Array 
				newlist[j]=salaries[j]+(salaries[j]/2);
				//using same Array to update the salaries 
				salaries[j]+=salaries[j]/2;
			}
			else
			{
				newlist[j]=salaries[j];
			}
		}
		
		System.out.println("new Salary list by updating the Same salary list: ");
		for(int k:salaries)
		{
			System.out.println(k);
		}
		System.out.println("New Salary list Using separate Array:");
		for(int g=0;g<newlist.length;g++)
		{
			System.out.println( "Previous Salary: "+prevsal[g]+" New Salary: "+newlist[g]);
		}
		
		
	}

}
