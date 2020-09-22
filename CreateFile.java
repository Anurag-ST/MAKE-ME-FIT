package anurag;

import java.io.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile
{
	void newf(String k)
	{
	{
	try  
	   {
		File obj=new File(" D:\\Mini\\"+k+".txt");
	 
		System.out.println("file created");
		if (obj.createNewFile()){
		System.out.println("created"); }
		else 
		{
		System.out.println("not created");
		} 
		}
    catch (IOException e)
	    {
		System.out.println("Error");
		e.printStackTrace(); 
		} 
}
}
}