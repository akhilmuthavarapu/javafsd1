package com.nit.Friday;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ********MY CODE*****************
		String s1="secur";
		String s2="rescue";
		System.out.println((s1.length()==s2.length())?"equals":"not equal");
		boolean anagram=false;
		if (s1.length()==s2.length())
		{
			
		for (int i=0;i<s1.length();i++)
		{
			char ch1=s1.charAt(i);
			for(int j=0;j<s2.length()-1;j++)
			{
				char ch2=s2.charAt(j);
				if (ch1==ch2)
				{
					anagram=true;
					break;
				}
				else
				{
					anagram=false;
				}
			}
		}
		if (anagram)
		{
			System.out.println("it is a anagram");
		}
		else
		{
			System.out.println("it is not a anagram");
		}
		}
		else
		{
			System.out.println("length not equal so not a anagram");
		}
		
		
		
		
		
		
		
		
		
		
		
		//***** TRAINER CODE ***************
		String str1 = "securra";
		String str2 = "rescuea";
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		// anagram
		boolean isAnagram = true;
		
		if(str1.length() == str2.length()) {
			char chI;
			//for(int i=0;i<str1.length()  ;i++) {
			for(int i=0;i<str1.length() && isAnagram ==true ;i++) {
				chI = str1.charAt(i);
				char chJ;
				boolean isCharFound = false;
				for(int j=0;j<str2.length();j++) {
					chJ = str2.charAt(j);
					if(chI == chJ) isCharFound = true;
				}
				if(isCharFound == false) {
					isAnagram = false;
					//break;
				}
				
				
			}
			
		}
		else {
			isAnagram = false;
		}
		
		if(isAnagram == true) {
			System.out.println("Yes .It is Anagram");
		}
		else {
			System.out.println("Not");
		}
		
		
		
	}

}
