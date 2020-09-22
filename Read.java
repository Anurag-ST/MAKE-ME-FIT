 package anurag;

import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class Read {
	void readF(String i)
	{
	try {
		File obj = new File("D:\\Mini\\"+i+".txt");
		Scanner myReader=new Scanner(obj);
		while(myReader.hasNextLine()) 
		{
		String data=myReader.nextLine();
		System.out.println(data);
		}
		myReader.close();
	}
		catch(FileNotFoundException e)
	{
		System.out.println("error");
		e.printStackTrace(); 
		} 

}
}
