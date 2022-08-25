package com.rajneesh;

import java.io.*;
import java.util.Scanner;

public class File2 {
     File f1,f2,f3,f4,f5;
     	public static void main(String[] args) throws IOException 
	{
		File2 obj=new File2();
		obj.create();
	}
   public void create() throws IOException
   {
	   Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String s1=sc.nextLine();
	    System.out.println("Hey "+s1+" you have to create multiple file in "
	   + "this program so just press the number how many file you want to create: "
	   + "But mininum limit of creation file is 2 and maximum is 5");
	    int a=sc.nextInt();
	    String[] s=new String[a];
	    if(a==2 || a==3 || a==4 || a==5)
	    {
	    
		System.out.println("Enter a file name:");
		for(int i=0;i<a;i++)
		{
		s[i]=sc.next();
		}
			if(a==2)
			{
				int i=0;
			    String s2=s[i];
				f1=new File(s2);
				f1.createNewFile();
				s2=s[++i];
				f2=new File(s2);
				f2.createNewFile();
			}
			else if(a==3)
			{
				int i=0;
			    String s2=s[i];
				 f1=new File(s2);
				f1.createNewFile();
				s2=s[++i];
				 f2=new File(s2);
				f2.createNewFile();	
				s2=s[++i];
			    f3=new File(s2);
				f2.createNewFile();
				}
			else if(a==4)
			{
				int i=0;
			    String s2=s[i];
				 f1=new File(s2);
				f1.createNewFile();
				s2=s[++i];
				f2=new File(s2);
				f2.createNewFile();	
				s2=s[++i];
			    f3=new File(s2);
				f3.createNewFile();
				s2=s[++i];
			    f4=new File(s2);
				f4.createNewFile();
				}
			else if(a==5)
			{
				int i=0;
			    String s2=s[i];
				f1=new File(s2);
				f1.createNewFile();
				s2=s[++i];
			    f2=new File(s2);
				f2.createNewFile();	
				s2=s[++i];
			    f3=new File(s2);
				f3.createNewFile();
				s2=s[++i];
				f4=new File(s2);
				f4.createNewFile();
				s2=s[++i];
				f5=new File(s2);
				f5.createNewFile();
				}
	    	sc.nextLine();
			System.out.println("Hey "+s1+" your "+a+" file created successfully now"
					+ " you can write data to file");
	
		System.out.println("Hey "+s1+" please enter some text data");
		String s3=sc.nextLine();
		System.out.println("Hey "+s1+" please enter a file name in which you want to write data");
		String s4=sc.nextLine();
		FileWriter fw=new FileWriter(s4);
		fw.write(s3);
		fw.close();
		File f6=new File(s4);
		f6.delete();
	    }
   }
}
