 package anurag;

import java.util.Scanner;
import java.io.*;

class Write extends Mem
{
 	void writeF(String ki)
 	{
	String str=ob1;
 	//System.out.println(ob1);
     String a= String.valueOf(ob2);
     String b= String.valueOf(ob3);
     String c= String.valueOf(ob4);
 try 
 {
 	File file = new File("D:\\Mini\\"+ki+".txt");
 FileWriter obj = new FileWriter("D:\\Mini\\"+ki+".txt",true);
 if(file.canWrite())
 	System.out.println("writtable");
 else
 	System.out.println("Error");
 obj.write(str);
 obj.write("\r\n");
 obj.write(a);
 obj.write("\r\n");
 obj.write(b);
 obj.write("\r\n");
 obj.write(c);
 obj.close();
 System.out.println("successfull"); }
 catch(IOException e) 
 {
 System.out.println("error");
 e.printStackTrace(); 
 }
 }
 }