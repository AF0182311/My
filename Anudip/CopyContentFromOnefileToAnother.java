// Write a program to read content from one file and write it into another file 
// 1st way 
import java.io.*;
class Hello
{
         public static void main(String[] args) throws IOException
              {
                            FileReader fr=new FileReader("C:\\Users\\Rajneesh\\Desktop\\abc.txt");
	           FileWriter fw=new FileWriter("C:\\Users\\Rajneesh\\Desktop\\abc1.txt");
	            int r1;
		while((r1=fr.read())!=-1)
		{
		   fw.write(r1);	
		}
		fw.close();
		fr.close();
                 } 
}

// 2nd way
import java.io.*;
class Hii
{
          public static void main(String[] args) throws IOException
                  {
                                  FileInputStream fin=new FileInputStream("C:\\Users\\Rajneesh\\Desktop\\ranjeet.txt");
		FileOutputStream fout=new FileOutputStream("C:\\Users\\Rajneesh\\Desktop\\ranjeet1.txt");
		int r1;
		while((r1=fin.read())!=-1)
		{
		   fout.write(r1);	
		}
		fout.close();
		fin.close();
	}
}