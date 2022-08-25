package com.rajneesh;
// Wap to create file write some data to file and read that data from the file
//and delete that file
import java.io.*;
public class File1 {

	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter(f);
        fw.write("Hello rajneesh how are you !!");
        fw.close();
        FileReader fr=new FileReader(f);
       int r1;
        while((r1=fr.read())!=-1)
        {
        	System.out.print((char)(r1));
        }
        fr.close();
        System.out.println(f.exists());
        System.out.println(f.delete());
	}

}
