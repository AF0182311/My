package com.rajneesh;

import java.io.*;
//import java.io.IOException;
import java.util.Scanner;

public class Rename {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
        f.createNewFile();
        File f1=new File("abc1.txt");
        f.renameTo(f1);
		/*FileReader fr=new FileReader("C:\\Users\\Rajneesh\\Desktop\\Hello1.java");
		int r1;
        while((r1=fr.read())!=-1)
        {
        	System.out.print((char)(r1));
        }
       fr.close();*/
		/*File f=new File("C:\\Users\\Rajneesh\\Desktop\\Hello1.java");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			String s=sc.nextLine();
			System.out.println(s);
		}*/
		/* Copy a content from one file to another file 
		FileReader fr=new FileReader("C:\\Users\\Rajneesh\\Desktop\\Hello1.java");
		FileWriter fw=new FileWriter("C:\\Users\\Rajneesh\\Desktop\\Hello2.java");
		int r1;
		while((r1=fr.read())!=-1)
		{
		   fw.write(r1);	
		}
		fw.close();
		fr.close();
		*/
		FileInputStream fin=new FileInputStream("C:\\Users\\Rajneesh\\Desktop\\Hello1.java");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Rajneesh\\Desktop\\Hello2.java");
		int r1;
		while((r1=fin.read())!=-1)
		{
		   fout.write(r1);	
		}
		fout.close();
		fin.close();
	}
}
