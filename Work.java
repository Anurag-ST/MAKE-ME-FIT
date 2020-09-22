 package anurag;

import java.util.*;
public class Work 
{
public static void main(String[]args)
{
	int i = 0;
	int t=1;
   int k=1;
	while (t>0)
	{
	System.out.print("\t**********************\n");
	System.out.print("\tWELCOME TO MAKE ME FIT\n");
	System.out.print("\t**********************\n");
	System.out.print("\n\n\nSELCT YOUR OPTION\n");
	System.out.print("1.SIGN IN\n2.LOG IN\n");
	Scanner op = new Scanner(System.in);
	int c=op.nextInt(); 
	Mem ob=new Mem();
	Write lo=new Write();
	 if(c==1)
	{System.out.print("Enter a unique ID\n");
	Scanner opm=new Scanner(System.in);
	String soul=opm.nextLine();
		for(i=0;i<20;i++)
	   { 
		CreateFile sem=new CreateFile();
		//sem.newf(soul);		
		ob.ent();
		lo.writeF(soul);
		
		break;
	   } 
   }   
	else
   {
		if(k==1)
		{Scanner opg=new Scanner(System.in);
		System.out.print("Enter your unique ID\n");
		 String l=opg.nextLine();
		 Read read = new Read();
		 read.readF(l);
		}
		else
		{
		System.out.print("Not a  Members\n");
		System.out.print("Sign up\n");
		System.out.print("Enter a unique ID\n");
		Scanner opm=new Scanner(System.in);
		String soul=opm.nextLine();
			for(i=0;i<20;i++)
		   { 
			CreateFile sem=new CreateFile();
			//sem.newf(soul);		
			ob.ent();
			lo.writeF(soul);
			
			break;
		   } 
		 
		}	
	}System.out.print("\nWnat to check the BMI\nPress 1 to check BMI:\nPress 0 to cancel\n");
	 int h=op.nextInt();
	 if(h==1)
	 { 
	     Bmi om= new Bmi();
		 om.showBmi(h);
	 }
	 else
	 {
		 System.out.print("\n");
	 }
	 System.out.print("\nLET'S GET STARTED\nEnter the day of the week\n1.Monday\n2.Tuesday\n3.Wednesday\n4.Thusday\n5.Friday\n6.Saterday\n7.Sunday\n");
	 Out ok=new Out();
	 int day=op.nextInt();
	 ok.ex(day);
	 System.out.print("\nEnter your BMI\n\n");
	 diet di=new diet(); 
	 int bi=op.nextInt();
	 di.showDiet(bi); 
	System.out.print("\n\tPress 0 to exit\nPress 1 to return to menu\n");
	  t=op.nextInt();
	}
	 
	
}
}
