 package anurag;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
 public class Mem 
	{
	static String obj[]=new String[20];
	static int ag[]=new int[20];
	static int wt[]=new int [20];
	static int ht[]=new int[20];
	static int  o=0;
	public static String ob1;
	public static int ob2,ob3,ob4;
	void ent()
	{ 
		Scanner in=new Scanner(System.in);
		
		for(int i=o;i<20;i++)
		{ 
			System.out.print("Enter your name\n");
			 ob1= in.nextLine();
			 obj[i]=ob1;
			 System.out.print("Enter your age\n");
			 ob2= in.nextInt();
			ag[i]=ob2;
			System.out.print("Enter your height in centimeter\n");
			ob3=in.nextInt();
			ht[i]=ob3;
			System.out.print("Enter your weight in KG\n");
			 ob4=in.nextInt();
			wt[i]=ob4;
			o++;
			break;
		}
		
	}
	void disp(int i)
	{ 
	     System.out.print("the details are:\n");
	     System.out.println(obj[i]+"\n"+ag[i]+"\n"+ht[i]+"\n"+wt[i]+"\n");
	     
	}
	 
	}